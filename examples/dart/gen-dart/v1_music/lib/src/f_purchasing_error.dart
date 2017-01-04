// Autogenerated by Frugal Compiler (2.0.0-RC5)
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart' as thrift;
import 'package:v1_music/v1_music.dart' as t_v1_music;

/// Exceptions are converted to the native format for each compiled
/// language.
class PurchasingError extends Error implements thrift.TBase {
  static final thrift.TStruct _STRUCT_DESC = new thrift.TStruct("PurchasingError");
  static final thrift.TField _MESSAGE_FIELD_DESC = new thrift.TField("message", thrift.TType.STRING, 1);
  static final thrift.TField _ERROR_CODE_FIELD_DESC = new thrift.TField("error_code", thrift.TType.I16, 2);

  String _message;
  static const int MESSAGE = 1;
  int _error_code = 0;
  static const int ERROR_CODE = 2;

  bool __isset_error_code = false;

  PurchasingError() {
  }

  String get message => this._message;

  set message(String message) {
    this._message = message;
  }

  bool isSetMessage() => this.message != null;

  unsetMessage() {
    this.message = null;
  }

  int get error_code => this._error_code;

  set error_code(int error_code) {
    this._error_code = error_code;
    this.__isset_error_code = true;
  }

  bool isSetError_code() => this.__isset_error_code;

  unsetError_code() {
    this.__isset_error_code = false;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case MESSAGE:
        return this.message;
      case ERROR_CODE:
        return this.error_code;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch(fieldID) {
      case MESSAGE:
        if(value == null) {
          unsetMessage();
        } else {
          this.message = value as String;
        }
        break;

      case ERROR_CODE:
        if(value == null) {
          unsetError_code();
        } else {
          this.error_code = value as int;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if the field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch(fieldID) {
      case MESSAGE:
        return isSetMessage();
      case ERROR_CODE:
        return isSetError_code();
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  read(thrift.TProtocol iprot) {
    thrift.TField field;
    iprot.readStructBegin();
    while(true) {
      field = iprot.readFieldBegin();
      if(field.type == thrift.TType.STOP) {
        break;
      }
      switch(field.id) {
        case MESSAGE:
          if(field.type == thrift.TType.STRING) {
            message = iprot.readString();
          } else {
            thrift.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ERROR_CODE:
          if(field.type == thrift.TType.I16) {
            error_code = iprot.readI16();
            this.__isset_error_code = true;
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

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  write(thrift.TProtocol oprot) {
    validate();

    oprot.writeStructBegin(_STRUCT_DESC);
    if(this.message != null) {
      oprot.writeFieldBegin(_MESSAGE_FIELD_DESC);
      oprot.writeString(message);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_ERROR_CODE_FIELD_DESC);
    oprot.writeI16(error_code);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("PurchasingError(");

    ret.write("message:");
    if(this.message == null) {
      ret.write("null");
    } else {
      ret.write(this.message);
    }

    ret.write(", ");
    ret.write("error_code:");
    ret.write(this.error_code);

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }
}
