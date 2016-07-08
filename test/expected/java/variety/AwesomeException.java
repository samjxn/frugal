/**
 * Autogenerated by Frugal Compiler (1.9.1)
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
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Generated(value = "Autogenerated by Frugal Compiler (1.9.1)", date = "2015-11-24")
public class AwesomeException extends TException implements org.apache.thrift.TBase<AwesomeException, AwesomeException._Fields>, java.io.Serializable, Cloneable, Comparable<AwesomeException> {
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AwesomeException");

	private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("ID", org.apache.thrift.protocol.TType.I64, (short)1);
	private static final org.apache.thrift.protocol.TField REASON_FIELD_DESC = new org.apache.thrift.protocol.TField("Reason", org.apache.thrift.protocol.TType.STRING, (short)2);

	private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
	static {
		schemes.put(StandardScheme.class, new AwesomeExceptionStandardSchemeFactory());
		schemes.put(TupleScheme.class, new AwesomeExceptionTupleSchemeFactory());
	}

	/**
	 * ID is a unique identifier for an awesome exception.
	 */
	public long ID; // required
	/**
	 * Reason contains the error message.
	 */
	public String Reason; // required
	/** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {
		/**
		 * ID is a unique identifier for an awesome exception.
		 */
		ID((short)1, "ID"),
		/**
		 * Reason contains the error message.
		 */
		REASON((short)2, "Reason")
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
				case 2: // REASON
					return REASON;
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
	public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
		tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("ID", org.apache.thrift.TFieldRequirementType.DEFAULT,
				new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64, "id")));
		tmpMap.put(_Fields.REASON, new org.apache.thrift.meta_data.FieldMetaData("Reason", org.apache.thrift.TFieldRequirementType.DEFAULT,
				new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AwesomeException.class, metaDataMap);
	}

	public AwesomeException() {
	}

	public AwesomeException(
		long ID,
		String Reason) {
		this();
		this.ID = ID;
		setIDIsSet(true);
		this.Reason = Reason;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public AwesomeException(AwesomeException other) {
		__isset_bitfield = other.__isset_bitfield;
		this.ID = other.ID;
		if (other.isSetReason()) {
			this.Reason = other.Reason;
		}
	}

	public AwesomeException deepCopy() {
		return new AwesomeException(this);
	}

	@Override
	public void clear() {
		setIDIsSet(false);
		this.ID = 0;

		this.Reason = null;

	}

	/**
	 * ID is a unique identifier for an awesome exception.
	 */
	public long getID() {
		return this.ID;
	}

	/**
	 * ID is a unique identifier for an awesome exception.
	 */
	public AwesomeException setID(long ID) {
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
	 * Reason contains the error message.
	 */
	public String getReason() {
		return this.Reason;
	}

	/**
	 * Reason contains the error message.
	 */
	public AwesomeException setReason(String Reason) {
		this.Reason = Reason;
		return this;
	}

	public void unsetReason() {
		this.Reason = null;
	}

	/** Returns true if field Reason is set (has been assigned a value) and false otherwise */
	public boolean isSetReason() {
		return this.Reason != null;
	}

	public void setReasonIsSet(boolean value) {
		if (!value) {
			this.Reason = null;
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

		case REASON:
			if (value == null) {
				unsetReason();
			} else {
				setReason((String)value);
			}
			break;

		}
	}

	public Object getFieldValue(_Fields field) {
		switch (field) {
		case ID:
			return getID();

		case REASON:
			return getReason();

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
		case REASON:
			return isSetReason();
		}
		throw new IllegalStateException();
	}

	@Override
	public boolean equals(Object that) {
		if (that == null)
			return false;
		if (that instanceof AwesomeException)
			return this.equals((AwesomeException)that);
		return false;
	}

	public boolean equals(AwesomeException that) {
		if (that == null)
			return false;

		boolean this_present_ID = true;
		boolean that_present_ID = true;
		if (this_present_ID || that_present_ID) {
			if (!(this_present_ID && that_present_ID))
				return false;
			if (this.ID != that.ID)
				return false;
		}

		boolean this_present_Reason = true && this.isSetReason();
		boolean that_present_Reason = true && that.isSetReason();
		if (this_present_Reason || that_present_Reason) {
			if (!(this_present_Reason && that_present_Reason))
				return false;
			if (!this.Reason.equals(that.Reason))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		List<Object> list = new ArrayList<Object>();

		boolean present_ID = true;
		list.add(present_ID);
		if (present_ID)
			list.add(ID);

		boolean present_Reason = true && (isSetReason());
		list.add(present_Reason);
		if (present_Reason)
			list.add(Reason);

		return list.hashCode();
	}

	@Override
	public int compareTo(AwesomeException other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = Boolean.valueOf(isSetID()).compareTo(other.isSetID());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetID()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ID, other.ID);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetReason()).compareTo(other.isSetReason());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetReason()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Reason, other.Reason);
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
		schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
	}

	public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
		schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("AwesomeException(");
		boolean first = true;

		sb.append("ID:");
		sb.append(this.ID);
		first = false;
		if (!first) sb.append(", ");
		sb.append("Reason:");
		if (this.Reason == null) {
			sb.append("null");
		} else {
			sb.append(this.Reason);
		}
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

	private static class AwesomeExceptionStandardSchemeFactory implements SchemeFactory {
		public AwesomeExceptionStandardScheme getScheme() {
			return new AwesomeExceptionStandardScheme();
		}
	}

	private static class AwesomeExceptionStandardScheme extends StandardScheme<AwesomeException> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, AwesomeException struct) throws org.apache.thrift.TException {
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
					case 2: // REASON
						if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
							struct.Reason = iprot.readString();
							struct.setReasonIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, AwesomeException struct) throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			oprot.writeFieldBegin(ID_FIELD_DESC);
			oprot.writeI64(struct.ID);
			oprot.writeFieldEnd();
			if (struct.Reason != null) {
				oprot.writeFieldBegin(REASON_FIELD_DESC);
				oprot.writeString(struct.Reason);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class AwesomeExceptionTupleSchemeFactory implements SchemeFactory {
		public AwesomeExceptionTupleScheme getScheme() {
			return new AwesomeExceptionTupleScheme();
		}
	}

	private static class AwesomeExceptionTupleScheme extends TupleScheme<AwesomeException> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, AwesomeException struct) throws org.apache.thrift.TException {
			TTupleProtocol oprot = (TTupleProtocol) prot;
			BitSet optionals = new BitSet();
			if (struct.isSetID()) {
				optionals.set(0);
			}
			if (struct.isSetReason()) {
				optionals.set(1);
			}
			oprot.writeBitSet(optionals, 2);
			if (struct.isSetID()) {
				oprot.writeI64(struct.ID);
			}
			if (struct.isSetReason()) {
				oprot.writeString(struct.Reason);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, AwesomeException struct) throws org.apache.thrift.TException {
			TTupleProtocol iprot = (TTupleProtocol) prot;
			BitSet incoming = iprot.readBitSet(2);
			if (incoming.get(0)) {
				struct.ID = iprot.readI64();
				struct.setIDIsSet(true);
			}
			if (incoming.get(1)) {
				struct.Reason = iprot.readString();
				struct.setReasonIsSet(true);
			}
		}

	}

}
