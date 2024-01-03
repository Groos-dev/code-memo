package com.xin.daily.common;

import lombok.Data;

/**
 * @author zengxin
 */
@Data
public class Result<T> {
  T data;
  int code;

  String message;

  public static <T> Result<T> success(T data){
    Result<T> result =  new Result<>();
    result.setCode(0);
    result.setData(data);
    result.setMessage("success");
    return result;
  }
}