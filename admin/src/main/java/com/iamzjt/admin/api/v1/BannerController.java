package com.iamzjt.admin.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BannerController {
  // RestFul API
  // 自描述性
  // host:port/v1/banner/test

  @GetMapping("v1/banner/test")
  public String test() {
    return "hello, IamZJT!";
  }
}
