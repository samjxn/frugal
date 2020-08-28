/*
 * Copyright 2020 Workiva
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.workiva.frugal.protocol;

import com.workiva.frugal.exception.TApplicationExceptionType;
import com.workiva.frugal.exception.TTransportExceptionType;
import com.workiva.frugal.FContext;
import com.workiva.frugal.transport.FTransport;
import com.workiva.frugal.transport.TMemoryOutputBuffer;
import org.apache.thrift.protocol.TMessage;
import org.apache.thrift.protocol.TMessageType;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.TApplicationException;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.apache.thrift.TSerializable;

/**
 * FProtocolHelper is used by generated code to consolidate the logic generated.
 */
public class FProtocolHelper {

	private FTransport transport;
	private FProtocolFactory protocolFactory;

	public FProtocolHelper(FTransport transport, FProtocolFactory protocolFactory) {
		this.transport = transport;
		this.protocolFactory = protocolFactory;
	}

	public void request(FContext ctx, String method, TSerializable args, TSerializable res) throws TException {
		TMemoryOutputBuffer memoryBuffer = new TMemoryOutputBuffer(transport.getRequestSizeLimit());
		FProtocol oprot = protocolFactory.getProtocol(memoryBuffer);
		oprot.writeRequestHeader(ctx);
		oprot.writeMessageBegin(new TMessage(method, TMessageType.CALL, 0));
		args.write(oprot);
		oprot.writeMessageEnd();
		TTransport response = transport.request(ctx, memoryBuffer.getWriteBytes());
		FProtocol iprot = protocolFactory.getProtocol(response);
		iprot.readResponseHeader(ctx);
		TMessage message = iprot.readMessageBegin();
		if (!message.name.equals(method)) {
			throw new TApplicationException(TApplicationExceptionType.WRONG_METHOD_NAME, method + " failed: wrong method name");
		}
		if (message.type == TMessageType.EXCEPTION) {
			TApplicationException e = TApplicationException.readFrom(iprot);
			iprot.readMessageEnd();
			TException returnedException = e;
			if (e.getType() == TApplicationExceptionType.RESPONSE_TOO_LARGE) {
				returnedException = new TTransportException(TTransportExceptionType.RESPONSE_TOO_LARGE, e.getMessage());
			}
			throw returnedException;
		}
		if (message.type != TMessageType.REPLY) {
			throw new TApplicationException(TApplicationExceptionType.INVALID_MESSAGE_TYPE, method + " failed: invalid message type");
		}
		res.read(iprot);
		iprot.readMessageEnd();
	}

	public void oneway(FContext ctx, String method, TSerializable args) throws TException {
		TMemoryOutputBuffer memoryBuffer = new TMemoryOutputBuffer(transport.getRequestSizeLimit());
		FProtocol oprot = protocolFactory.getProtocol(memoryBuffer);
		oprot.writeRequestHeader(ctx);
		oprot.writeMessageBegin(new TMessage(method, TMessageType.ONEWAY, 0));
		args.write(oprot);
		oprot.writeMessageEnd();
		transport.oneway(ctx, memoryBuffer.getWriteBytes());
	}
}
