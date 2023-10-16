package com.iamzjt.admin.api.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BannerController {
  @GetMapping("/test")
  public String test() {
    return "Hello World!";
  }
}
