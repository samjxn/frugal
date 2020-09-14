package frugal

import "git.apache.org/thrift.git/lib/go/thrift"

var _ FClient = (*FStandardClient)(nil)

// FClient ...
type FClient interface {
	Call(ctx FContext, method string, args, result thrift.TStruct) error
	Oneway(ctx FContext, method string, args thrift.TStruct) error
	Publish(ctx FContext, op, topic string, message thrift.TStruct) error
}

// FStandardClient implements FClient, and uses the standard message format for Frugal.
type FStandardClient struct {
	transport       FTransport
	publisher       FPublisherTransport
	protocolFactory *FProtocolFactory
	limit           uint
}

// NewFStandardClient implements FClient, and uses the standard message format for Frugal.
func NewFStandardClient(provider *FServiceProvider) *FStandardClient {
	client := &FStandardClient{
		transport:       provider.GetTransport(),
		protocolFactory: provider.GetProtocolFactory(),
	}
	client.limit = client.transport.GetRequestSizeLimit()
	return client
}

// NewFScopeClient ...
func NewFScopeClient(provider *FScopeProvider) *FStandardClient {
	transport, protocolFactory := provider.NewPublisher()
	client := &FStandardClient{
		publisher:       transport,
		protocolFactory: protocolFactory,
	}
	client.limit = client.publisher.GetPublishSizeLimit()
	return client
}

// Call invokes a service.
func (client *FStandardClient) Call(ctx FContext, method string, args, result thrift.TStruct) error {
	payload, err := client.prepareMessage(ctx, method, args, thrift.CALL)
	if err != nil {
		return err
	}
	resultTransport, err := client.transport.Request(ctx, payload)
	if err != nil {
		return err
	}
	iprot := client.protocolFactory.GetProtocol(resultTransport)
	if err = iprot.ReadResponseHeader(ctx); err != nil {
		return err
	}
	oMethod, mTypeID, _, err := iprot.ReadMessageBegin()
	if err != nil {
		return err
	}
	if oMethod != method {
		return thrift.NewTApplicationException(APPLICATION_EXCEPTION_WRONG_METHOD_NAME, method+" failed: wrong method name")
	}
	if mTypeID == thrift.EXCEPTION {
		error0 := thrift.NewTApplicationException(APPLICATION_EXCEPTION_UNKNOWN, "Unknown Exception")
		var error1 thrift.TApplicationException
		error1, err = error0.Read(iprot)
		if err != nil {
			return err
		}
		if err = iprot.ReadMessageEnd(); err != nil {
			return err
		}
		if error1.TypeId() == APPLICATION_EXCEPTION_RESPONSE_TOO_LARGE {
			return thrift.NewTTransportException(TRANSPORT_EXCEPTION_RESPONSE_TOO_LARGE, error1.Error())
		}
		return error1
	}
	if mTypeID != thrift.REPLY {
		return thrift.NewTApplicationException(APPLICATION_EXCEPTION_INVALID_MESSAGE_TYPE, method+" failed: invalid message type")
	}
	if err = result.Read(iprot); err != nil {
		return err
	}
	return iprot.ReadMessageEnd()
}

// Oneway ...
func (client *FStandardClient) Oneway(ctx FContext, method string, args thrift.TStruct) error {
	payload, err := client.prepareMessage(ctx, method, args, thrift.ONEWAY)
	if err != nil {
		return err
	}
	return client.transport.Oneway(ctx, payload)
}

// Publish ...
func (client *FStandardClient) Publish(ctx FContext, op, topic string, message thrift.TStruct) error {
	payload, err := client.prepareMessage(ctx, op, message, thrift.CALL)
	if err != nil {
		return err
	}
	return client.publisher.Publish(topic, payload)
}

func (client FStandardClient) prepareMessage(ctx FContext, method string, args thrift.TStruct, kind thrift.TMessageType) ([]byte, error) {
	buffer := NewTMemoryOutputBuffer(client.limit)
	oprot := client.protocolFactory.GetProtocol(buffer)
	if err := oprot.WriteRequestHeader(ctx); err != nil {
		return nil, err
	}
	if err := oprot.WriteMessageBegin(method, kind, 0); err != nil {
		return nil, err
	}
	if err := args.Write(oprot); err != nil {
		return nil, err
	}
	if err := oprot.WriteMessageEnd(); err != nil {
		return nil, err
	}
	if err := oprot.Flush(); err != nil {
		return nil, err
	}
	return buffer.Bytes(), nil
}
