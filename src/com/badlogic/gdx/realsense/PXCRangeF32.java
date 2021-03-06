/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.realsense;

public class PXCRangeF32 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected PXCRangeF32(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PXCRangeF32 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        realsenseJNI.delete_PXCRangeF32(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMin(float value) {
    realsenseJNI.PXCRangeF32_min_set(swigCPtr, this, value);
  }

  public float getMin() {
    return realsenseJNI.PXCRangeF32_min_get(swigCPtr, this);
  }

  public void setMax(float value) {
    realsenseJNI.PXCRangeF32_max_set(swigCPtr, this, value);
  }

  public float getMax() {
    return realsenseJNI.PXCRangeF32_max_get(swigCPtr, this);
  }

  public PXCRangeF32() {
    this(realsenseJNI.new_PXCRangeF32(), true);
  }

}
