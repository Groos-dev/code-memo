package com.xin.daily.controller;

import com.xin.daily.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zengxin
 */
@RequestMapping("v1")
@RestController
public class HelloController {
  @GetMapping("hello")
  public Result<Object> sayHello(){
    return Result.success("hello word");
  }
}
