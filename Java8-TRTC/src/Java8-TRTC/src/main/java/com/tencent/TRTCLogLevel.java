/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.tencent;

public final class TRTCLogLevel {
  public final static TRTCLogLevel TRTCLogLevelVerbos = new TRTCLogLevel("TRTCLogLevelVerbos", 0);
  public final static TRTCLogLevel TRTCLogLevelDebug = new TRTCLogLevel("TRTCLogLevelDebug", 1);
  public final static TRTCLogLevel TRTCLogLevelInfo = new TRTCLogLevel("TRTCLogLevelInfo", 2);
  public final static TRTCLogLevel TRTCLogLevelWarn = new TRTCLogLevel("TRTCLogLevelWarn", 3);
  public final static TRTCLogLevel TRTCLogLevelError = new TRTCLogLevel("TRTCLogLevelError", 4);
  public final static TRTCLogLevel TRTCLogLevelFatal = new TRTCLogLevel("TRTCLogLevelFatal", 5);
  public final static TRTCLogLevel TRTCLogLevelNone = new TRTCLogLevel("TRTCLogLevelNone", 6);

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static TRTCLogLevel swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + TRTCLogLevel.class + " with value " + swigValue);
  }

  private TRTCLogLevel(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private TRTCLogLevel(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private TRTCLogLevel(String swigName, TRTCLogLevel swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static TRTCLogLevel[] swigValues = { TRTCLogLevelVerbos, TRTCLogLevelDebug, TRTCLogLevelInfo, TRTCLogLevelWarn, TRTCLogLevelError, TRTCLogLevelFatal, TRTCLogLevelNone };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

