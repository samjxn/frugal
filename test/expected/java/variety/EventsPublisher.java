/**
 * Autogenerated by Frugal Compiler (3.5.0)
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */

package variety.java;

import com.workiva.frugal.FContext;
import com.workiva.frugal.exception.TApplicationExceptionType;
import com.workiva.frugal.middleware.InvocationHandler;
import com.workiva.frugal.middleware.ServiceMiddleware;
import com.workiva.frugal.protocol.*;
import com.workiva.frugal.provider.FScopeProvider;
import com.workiva.frugal.transport.FPublisherTransport;
import com.workiva.frugal.transport.FSubscriberTransport;
import com.workiva.frugal.transport.FSubscription;
import com.workiva.frugal.transport.TMemoryOutputBuffer;
import org.apache.thrift.TException;
import org.apache.thrift.TApplicationException;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.apache.thrift.protocol.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




public class EventsPublisher {

	/**
	 * This docstring gets added to the generated code because it has
	 * the @ sign. Prefix specifies topic prefix tokens, which can be static or
	 * variable.
	 */
	public interface Iface {
		public void open() throws TException;

		public void close() throws TException;

		/**
		 * This is a docstring.
		 */
		public void publishEventCreated(FContext ctx, String user, Event req) throws TException;

		public void publishSomeInt(FContext ctx, String user, long req) throws TException;

		public void publishSomeStr(FContext ctx, String user, String req) throws TException;

		public void publishSomeList(FContext ctx, String user, java.util.List<java.util.Map<Long, Event>> req) throws TException;

	}

	/**
	 * This docstring gets added to the generated code because it has
	 * the @ sign. Prefix specifies topic prefix tokens, which can be static or
	 * variable.
	 */
	public static class Client implements Iface {
		private static final String DELIMITER = ".";

		private final Iface target;
		private final Iface proxy;

		public Client(FScopeProvider provider, ServiceMiddleware... middleware) {
			target = new InternalEventsPublisher(provider);
			List<ServiceMiddleware> combined = new ArrayList<ServiceMiddleware>(Arrays.asList(middleware));
			combined.addAll(provider.getMiddleware());
			middleware = combined.toArray(new ServiceMiddleware[0]);
			proxy = InvocationHandler.composeMiddleware(target, Iface.class, middleware);
		}

		public void open() throws TException {
			target.open();
		}

		public void close() throws TException {
			target.close();
		}

		/**
		 * This is a docstring.
		 */
		public void publishEventCreated(FContext ctx, String user, Event req) throws TException {
			proxy.publishEventCreated(ctx, user, req);
		}

		public void publishSomeInt(FContext ctx, String user, long req) throws TException {
			proxy.publishSomeInt(ctx, user, req);
		}

		public void publishSomeStr(FContext ctx, String user, String req) throws TException {
			proxy.publishSomeStr(ctx, user, req);
		}

		public void publishSomeList(FContext ctx, String user, java.util.List<java.util.Map<Long, Event>> req) throws TException {
			proxy.publishSomeList(ctx, user, req);
		}

		protected static class InternalEventsPublisher implements Iface {

			private FScopeProvider provider;
			private FPublisherTransport transport;
			private FProtocolFactory protocolFactory;

			protected InternalEventsPublisher() {
			}

			public InternalEventsPublisher(FScopeProvider provider) {
				this.provider = provider;
			}

			public void open() throws TException {
				FScopeProvider.Publisher publisher = provider.buildPublisher();
				transport = publisher.getTransport();
				protocolFactory = publisher.getProtocolFactory();
				transport.open();
			}

			public void close() throws TException {
				transport.close();
			}

			/**
			 * This is a docstring.
			 */
			public void publishEventCreated(FContext ctx, String user, Event req) throws TException {
				ctx.addRequestHeader("_topic_user", user);
				String op = "EventCreated";
				String prefix = String.format("foo.%s.", user);
				String topic = String.format("%sEvents%s%s", prefix, DELIMITER, op);
				TMemoryOutputBuffer memoryBuffer = new TMemoryOutputBuffer(transport.getPublishSizeLimit());
				FProtocol oprot = protocolFactory.getProtocol(memoryBuffer);
				oprot.writeRequestHeader(ctx);
				oprot.writeMessageBegin(new TMessage(op, TMessageType.CALL, 0));
				req.write(oprot);
				oprot.writeMessageEnd();
				transport.publish(topic, memoryBuffer.getWriteBytes());
			}


			public void publishSomeInt(FContext ctx, String user, long req) throws TException {
				ctx.addRequestHeader("_topic_user", user);
				String op = "SomeInt";
				String prefix = String.format("foo.%s.", user);
				String topic = String.format("%sEvents%s%s", prefix, DELIMITER, op);
				TMemoryOutputBuffer memoryBuffer = new TMemoryOutputBuffer(transport.getPublishSizeLimit());
				FProtocol oprot = protocolFactory.getProtocol(memoryBuffer);
				oprot.writeRequestHeader(ctx);
				oprot.writeMessageBegin(new TMessage(op, TMessageType.CALL, 0));
				long elem206 = req;
				oprot.writeI64(elem206);
				oprot.writeMessageEnd();
				transport.publish(topic, memoryBuffer.getWriteBytes());
			}


			public void publishSomeStr(FContext ctx, String user, String req) throws TException {
				ctx.addRequestHeader("_topic_user", user);
				String op = "SomeStr";
				String prefix = String.format("foo.%s.", user);
				String topic = String.format("%sEvents%s%s", prefix, DELIMITER, op);
				TMemoryOutputBuffer memoryBuffer = new TMemoryOutputBuffer(transport.getPublishSizeLimit());
				FProtocol oprot = protocolFactory.getProtocol(memoryBuffer);
				oprot.writeRequestHeader(ctx);
				oprot.writeMessageBegin(new TMessage(op, TMessageType.CALL, 0));
				String elem207 = req;
				oprot.writeString(elem207);
				oprot.writeMessageEnd();
				transport.publish(topic, memoryBuffer.getWriteBytes());
			}


			public void publishSomeList(FContext ctx, String user, java.util.List<java.util.Map<Long, Event>> req) throws TException {
				ctx.addRequestHeader("_topic_user", user);
				String op = "SomeList";
				String prefix = String.format("foo.%s.", user);
				String topic = String.format("%sEvents%s%s", prefix, DELIMITER, op);
				TMemoryOutputBuffer memoryBuffer = new TMemoryOutputBuffer(transport.getPublishSizeLimit());
				FProtocol oprot = protocolFactory.getProtocol(memoryBuffer);
				oprot.writeRequestHeader(ctx);
				oprot.writeMessageBegin(new TMessage(op, TMessageType.CALL, 0));
				oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.MAP, req.size()));
				for (java.util.Map<Long, Event> elem208 : req) {
					oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I64, org.apache.thrift.protocol.TType.STRUCT, elem208.size()));
					for (Map.Entry<Long, Event> elem209 : elem208.entrySet()) {
						long elem210 = elem209.getKey();
						oprot.writeI64(elem210);
						elem209.getValue().write(oprot);
					}
					oprot.writeMapEnd();
				}
				oprot.writeListEnd();
				oprot.writeMessageEnd();
				transport.publish(topic, memoryBuffer.getWriteBytes());
			}
		}
	}
}
