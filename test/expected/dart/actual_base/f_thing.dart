// Autogenerated by Frugal Compiler (2.26.0)
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart' as thrift;
import 'package:actual_base_dart/actual_base_dart.dart' as t_actual_base_dart;

class thing implements thrift.TBase {
  static final thrift.TStruct _STRUCT_DESC = new thrift.TStruct("thing");
  static final thrift.TField _AN_ID_FIELD_DESC = new thrift.TField("an_id", thrift.TType.I32, 1);
  static final thrift.TField _A_STRING_FIELD_DESC = new thrift.TField("a_string", thrift.TType.STRING, 2);

  int an_id = 0;
  static const int AN_ID = 1;
  String a_string;
  static const int A_STRING = 2;


  thing() {
  }

  @deprecated
  bool isSetAn_id() => an_id != null;

  @deprecated
  unsetAn_id() => an_id = null;

  @deprecated
  bool isSetA_string() => a_string != null;

  @deprecated
  unsetA_string() => a_string = null;

  @override
  getFieldValue(int fieldID) {
    switch (fieldID) {
      case AN_ID:
        return this.an_id;
      case A_STRING:
        return this.a_string;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  @override
  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case AN_ID:
        an_id = value as int; // ignore: avoid_as
        break;

      case A_STRING:
        a_string = value as String; // ignore: avoid_as
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if the field corresponding to fieldID is set (has been assigned a value) and false otherwise
  @override
  bool isSet(int fieldID) {
    switch (fieldID) {
      case AN_ID:
        return an_id != null;

      case A_STRING:
        return a_string != null;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  @override
  read(thrift.TProtocol iprot) {
    iprot.readStructBegin();
    for (thrift.TField field = iprot.readFieldBegin();
        field.type != thrift.TType.STOP;
        field = iprot.readFieldBegin()) {
      switch (field.id) {
        case AN_ID:
          if (field.type == thrift.TType.I32) {
            an_id = iprot.readI32();
          } else {
            thrift.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case A_STRING:
          if (field.type == thrift.TType.STRING) {
            a_string = iprot.readString();
          } else {
            thrift.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          thrift.TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    validate();
  }

  @override
  write(thrift.TProtocol oprot) {
    validate();

    oprot.writeStructBegin(_STRUCT_DESC);
    oprot.writeFieldBegin(_AN_ID_FIELD_DESC);
    oprot.writeI32(an_id);
    oprot.writeFieldEnd();
    if (a_string != null) {
      oprot.writeFieldBegin(_A_STRING_FIELD_DESC);
      oprot.writeString(a_string);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @override
  String toString() {
    StringBuffer ret = new StringBuffer("thing(");

    ret.write("an_id:");
    ret.write(this.an_id);

    ret.write(", ");
    ret.write("a_string:");
    if (this.a_string == null) {
      ret.write("null");
    } else {
      ret.write(this.a_string);
    }

    ret.write(")");

    return ret.toString();
  }

  @override
  bool operator ==(Object o) {
    if (o is thing) {
      return this.an_id == o.an_id &&
        this.a_string == o.a_string;
    }
    return false;
  }

  @override
  int get hashCode {
    var value = 17;
    value = (value * 31) ^ an_id.hashCode;
    value = (value * 31) ^ a_string.hashCode;
    return value;
  }

  thing clone({
    int an_id: null,
    String a_string: null,
  }) {
    return new thing()
      ..an_id = an_id ?? this.an_id
      ..a_string = a_string ?? this.a_string;
  }

  validate() {
  }
}
