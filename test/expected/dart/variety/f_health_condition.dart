// Autogenerated by Frugal Compiler (1.19.0)
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING

library variety.src.f_health_condition;enum HealthCondition {
  PASS,
  WARN,
  FAIL,
  UNKNOWN,
}

int serializeHealthCondition(HealthCondition variant) {
  switch (variant) {
    case 1:
      return HealthCondition.PASS;
    case 2:
      return HealthCondition.WARN;
    case 3:
      return HealthCondition.FAIL;
    case 4:
      return HealthCondition.UNKNOWN;
  }
}

HealthCondition deserializeHealthCondition(int value) {
  switch (value) {
    case 1:
      return HealthCondition.PASS;
    case 2:
      return HealthCondition.WARN;
    case 3:
      return HealthCondition.FAIL;
    case 4:
      return HealthCondition.UNKNOWN;
    default:
      throw new thrift.TProtocolError(thrift.TProtocolErrorType.UNKNOWN, "Invalid value '$value' for enum 'HealthCondition'");  }
}

