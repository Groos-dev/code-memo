package com.xin.daily.common;

/**
 * @author zengxin
 */
public interface GenericResultStatus {
  boolean isSuccess();
  int getCode();
  String getMessage();
}
