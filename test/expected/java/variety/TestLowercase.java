/**
 * Autogenerated by Frugal Compiler (2.20.0)
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

@Generated(value = "Autogenerated by Frugal Compiler (2.20.0)", date = "2015-11-24")
public class TestLowercase implements org.apache.thrift.TBase<TestLowercase, TestLowercase._Fields>, java.io.Serializable, Cloneable, Comparable<TestLowercase> {
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TestLowercase");

	private static final org.apache.thrift.protocol.TField LOWERCASE_INT_FIELD_DESC = new org.apache.thrift.protocol.TField("lowercaseInt", org.apache.thrift.protocol.TType.I32, (short)1);

	private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
	static {
		schemes.put(StandardScheme.class, new TestLowercaseStandardSchemeFactory());
		schemes.put(TupleScheme.class, new TestLowercaseTupleSchemeFactory());
	}

	public int lowercaseInt;
	/** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {
		LOWERCASE_INT((short)1, "lowercaseInt")
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
				case 1: // LOWERCASE_INT
					return LOWERCASE_INT;
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
	private static final int __LOWERCASEINT_ISSET_ID = 0;
	private byte __isset_bitfield = 0;
	public TestLowercase() {
	}

	public TestLowercase(
		int lowercaseInt) {
		this();
		this.lowercaseInt = lowercaseInt;
		setLowercaseIntIsSet(true);
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public TestLowercase(TestLowercase other) {
		__isset_bitfield = other.__isset_bitfield;
		this.lowercaseInt = other.lowercaseInt;
	}

	public TestLowercase deepCopy() {
		return new TestLowercase(this);
	}

	@Override
	public void clear() {
		setLowercaseIntIsSet(false);
		this.lowercaseInt = 0;

	}

	public int getLowercaseInt() {
		return this.lowercaseInt;
	}

	public TestLowercase setLowercaseInt(int lowercaseInt) {
		this.lowercaseInt = lowercaseInt;
		setLowercaseIntIsSet(true);
		return this;
	}

	public void unsetLowercaseInt() {
		__isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LOWERCASEINT_ISSET_ID);
	}

	/** Returns true if field lowercaseInt is set (has been assigned a value) and false otherwise */
	public boolean isSetLowercaseInt() {
		return EncodingUtils.testBit(__isset_bitfield, __LOWERCASEINT_ISSET_ID);
	}

	public void setLowercaseIntIsSet(boolean value) {
		__isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LOWERCASEINT_ISSET_ID, value);
	}

	public void setFieldValue(_Fields field, Object value) {
		switch (field) {
		case LOWERCASE_INT:
			if (value == null) {
				unsetLowercaseInt();
			} else {
				setLowercaseInt((Integer)value);
			}
			break;

		}
	}

	public Object getFieldValue(_Fields field) {
		switch (field) {
		case LOWERCASE_INT:
			return getLowercaseInt();

		}
		throw new IllegalStateException();
	}

	/** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
	public boolean isSet(_Fields field) {
		if (field == null) {
			throw new IllegalArgumentException();
		}

		switch (field) {
		case LOWERCASE_INT:
			return isSetLowercaseInt();
		}
		throw new IllegalStateException();
	}

	@Override
	public boolean equals(Object that) {
		if (that == null)
			return false;
		if (that instanceof TestLowercase)
			return this.equals((TestLowercase)that);
		return false;
	}

	public boolean equals(TestLowercase that) {
		if (that == null)
			return false;

		boolean this_present_lowercaseInt = true;
		boolean that_present_lowercaseInt = true;
		if (this_present_lowercaseInt || that_present_lowercaseInt) {
			if (!(this_present_lowercaseInt && that_present_lowercaseInt))
				return false;
			if (this.lowercaseInt != that.lowercaseInt)
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		List<Object> list = new ArrayList<Object>();

		boolean present_lowercaseInt = true;
		list.add(present_lowercaseInt);
		if (present_lowercaseInt)
			list.add(lowercaseInt);

		return list.hashCode();
	}

	@Override
	public int compareTo(TestLowercase other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = Boolean.valueOf(isSetLowercaseInt()).compareTo(other.isSetLowercaseInt());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetLowercaseInt()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lowercaseInt, other.lowercaseInt);
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
		StringBuilder sb = new StringBuilder("TestLowercase(");
		boolean first = true;

		sb.append("lowercaseInt:");
		sb.append(this.lowercaseInt);
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

	private static class TestLowercaseStandardSchemeFactory implements SchemeFactory {
		public TestLowercaseStandardScheme getScheme() {
			return new TestLowercaseStandardScheme();
		}
	}

	private static class TestLowercaseStandardScheme extends StandardScheme<TestLowercase> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, TestLowercase struct) throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
					case 1: // LOWERCASE_INT
						if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
							struct.lowercaseInt = iprot.readI32();
							struct.setLowercaseIntIsSet(true);
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

		public void write(org.apache.thrift.protocol.TProtocol oprot, TestLowercase struct) throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			oprot.writeFieldBegin(LOWERCASE_INT_FIELD_DESC);
			int elem1 = struct.lowercaseInt;
			oprot.writeI32(elem1);
			oprot.writeFieldEnd();
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class TestLowercaseTupleSchemeFactory implements SchemeFactory {
		public TestLowercaseTupleScheme getScheme() {
			return new TestLowercaseTupleScheme();
		}
	}

	private static class TestLowercaseTupleScheme extends TupleScheme<TestLowercase> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, TestLowercase struct) throws org.apache.thrift.TException {
			TTupleProtocol oprot = (TTupleProtocol) prot;
			BitSet optionals = new BitSet();
			if (struct.isSetLowercaseInt()) {
				optionals.set(0);
			}
			oprot.writeBitSet(optionals, 1);
			if (struct.isSetLowercaseInt()) {
				int elem2 = struct.lowercaseInt;
				oprot.writeI32(elem2);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, TestLowercase struct) throws org.apache.thrift.TException {
			TTupleProtocol iprot = (TTupleProtocol) prot;
			BitSet incoming = iprot.readBitSet(1);
			if (incoming.get(0)) {
				struct.lowercaseInt = iprot.readI32();
				struct.setLowercaseIntIsSet(true);
			}
		}

	}

}
