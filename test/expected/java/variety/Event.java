/**
 * Autogenerated by Frugal Compiler (3.11.0)
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package variety.java;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import java.util.Objects;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This docstring gets added to the generated code because it has
 * the @ sign.
 */
public class Event implements org.apache.thrift.TBase<Event, Event._Fields>, java.io.Serializable, Cloneable, Comparable<Event> {
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Event");

	private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("ID", org.apache.thrift.protocol.TType.I64, (short)1);
	private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("Message", org.apache.thrift.protocol.TType.STRING, (short)2);

	/**
	 * ID is a unique identifier for an event.
	 */
	public long ID;
	/**
	 * Message contains the event payload.
	 */
	public String Message;
	/** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {
		/**
		 * ID is a unique identifier for an event.
		 */
		ID((short)1, "ID"),
		/**
		 * Message contains the event payload.
		 */
		MESSAGE((short)2, "Message")
		;

		private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

		static {
			for (_Fields field : EnumSet.allOf(_Fields.class)) {
				byName.put(field.getFieldName(), field);
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, or null if its not found.
		 */
		public static _Fields findByThriftId(int fieldId) {
			switch(fieldId) {
				case 1: // ID
					return ID;
				case 2: // MESSAGE
					return MESSAGE;
				default:
					return null;
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, throwing an exception
		 * if it is not found.
		 */
		public static _Fields findByThriftIdOrThrow(int fieldId) {
			_Fields fields = findByThriftId(fieldId);
			if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
			return fields;
		}

		/**
		 * Find the _Fields constant that matches name, or null if its not found.
		 */
		public static _Fields findByName(String name) {
			return byName.get(name);
		}

		private final short _thriftId;
		private final String _fieldName;

		_Fields(short thriftId, String fieldName) {
			_thriftId = thriftId;
			_fieldName = fieldName;
		}

		public short getThriftFieldId() {
			return _thriftId;
		}

		public String getFieldName() {
			return _fieldName;
		}
	}

	// isset id assignments
	private static final int __ID_ISSET_ID = 0;
	private byte __isset_bitfield = 0;
	public Event() {
		this.ID = varietyConstants.DEFAULT_ID;

	}

	public Event(
		long ID,
		String Message) {
		this();
		this.ID = ID;
		setIDIsSet(true);
		this.Message = Message;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public Event(Event other) {
		__isset_bitfield = other.__isset_bitfield;
		this.ID = other.ID;
		if (other.isSetMessage()) {
			this.Message = other.Message;
		}
	}

	public Event deepCopy() {
		return new Event(this);
	}

	@Override
	public void clear() {
		this.ID = varietyConstants.DEFAULT_ID;

		this.Message = null;

	}

	/**
	 * ID is a unique identifier for an event.
	 */
	public long getID() {
		return this.ID;
	}

	/**
	 * ID is a unique identifier for an event.
	 */
	public Event setID(long ID) {
		this.ID = ID;
		setIDIsSet(true);
		return this;
	}

	public void unsetID() {
		__isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
	}

	/** Returns true if field ID is set (has been assigned a value) and false otherwise */
	public boolean isSetID() {
		return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
	}

	public void setIDIsSet(boolean value) {
		__isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
	}

	/**
	 * Message contains the event payload.
	 */
	public String getMessage() {
		return this.Message;
	}

	/**
	 * Message contains the event payload.
	 */
	public Event setMessage(String Message) {
		this.Message = Message;
		return this;
	}

	public void unsetMessage() {
		this.Message = null;
	}

	/** Returns true if field Message is set (has been assigned a value) and false otherwise */
	public boolean isSetMessage() {
		return this.Message != null;
	}

	public void setMessageIsSet(boolean value) {
		if (!value) {
			this.Message = null;
		}
	}

	public void setFieldValue(_Fields field, Object value) {
		switch (field) {
		case ID:
			if (value == null) {
				unsetID();
			} else {
				setID((Long)value);
			}
			break;

		case MESSAGE:
			if (value == null) {
				unsetMessage();
			} else {
				setMessage((String)value);
			}
			break;

		}
	}

	public Object getFieldValue(_Fields field) {
		switch (field) {
		case ID:
			return getID();

		case MESSAGE:
			return getMessage();

		}
		throw new IllegalStateException();
	}

	/** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
	public boolean isSet(_Fields field) {
		if (field == null) {
			throw new IllegalArgumentException();
		}

		switch (field) {
		case ID:
			return isSetID();
		case MESSAGE:
			return isSetMessage();
		}
		throw new IllegalStateException();
	}

	@Override
	public boolean equals(Object that) {
		if (that == null)
			return false;
		if (that instanceof Event)
			return this.equals((Event)that);
		return false;
	}

	public boolean equals(Event that) {
		if (that == null)
			return false;
		if (this.ID != that.ID)
			return false;
		if (!Objects.equals(this.Message, that.Message))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		List<Object> list = new ArrayList<Object>();

		boolean present_ID = true;
		list.add(present_ID);
		if (present_ID)
			list.add(ID);

		boolean present_Message = true && (isSetMessage());
		list.add(present_Message);
		if (present_Message)
			list.add(Message);

		return list.hashCode();
	}

	@Override
	public int compareTo(Event other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = Boolean.compare(isSetID(), other.isSetID());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetID()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ID, other.ID);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.compare(isSetMessage(), other.isSetMessage());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetMessage()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Message, other.Message);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		return 0;
	}

	public _Fields fieldForId(int fieldId) {
		return _Fields.findByThriftId(fieldId);
	}

	public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
		if (iprot.getScheme() != StandardScheme.class) {
			throw new UnsupportedOperationException();
		}
		new EventStandardScheme().read(iprot, this);
	}

	public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
		if (oprot.getScheme() != StandardScheme.class) {
			throw new UnsupportedOperationException();
		}
		new EventStandardScheme().write(oprot, this);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Event(");
		boolean first = true;

		sb.append("ID:");
		sb.append(this.ID);
		first = false;
		if (!first) sb.append(", ");
		sb.append("Message:");
		sb.append(this.Message);
		first = false;
		sb.append(")");
		return sb.toString();
	}

	public void validate() throws org.apache.thrift.TException {
		// check for required fields
		// check for sub-struct validity
	}

	private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
		try {
			write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
		try {
			// it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
			__isset_bitfield = 0;
			read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private static class EventStandardScheme extends StandardScheme<Event> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, Event struct) throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
					case 1: // ID
						if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
							struct.ID = iprot.readI64();
							struct.setIDIsSet(true);
						} else {
							org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
						}
						break;
					case 2: // MESSAGE
						if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
							struct.Message = iprot.readString();
							struct.setMessageIsSet(true);
						} else {
							org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
						}
						break;
					default:
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
				}
				iprot.readFieldEnd();
			}
			iprot.readStructEnd();

			// check for required fields of primitive type, which can't be checked in the validate method
			struct.validate();
		}

		public void write(org.apache.thrift.protocol.TProtocol oprot, Event struct) throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			oprot.writeFieldBegin(ID_FIELD_DESC);
			long elem2 = struct.ID;
			oprot.writeI64(elem2);
			oprot.writeFieldEnd();
			if (struct.isSetMessage()) {
				oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
				String elem3 = struct.Message;
				oprot.writeString(elem3);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

}
