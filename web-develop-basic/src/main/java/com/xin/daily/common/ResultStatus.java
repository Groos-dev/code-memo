package com.xin.daily.common;

/**
 * @author zengxin
 */

public enum ResultStatus implements GenericResultStatus {

  SUCCESS(0, true, "success")
  ;
  private final int code;
  private final boolean success;
  private final String message;

  ResultStatus(int code, boolean success,  String message) {
    this.code = code;
    this.success = success;
    this.message = message;
  }


  @Override
  public boolean isSuccess() {
    return success;
  }

  @Override
  public int getCode() {
    return code;
  }

  @Override
  public String getMessage() {
    return message;
  }
}
