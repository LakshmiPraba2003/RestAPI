package com.example.demo.pack3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day1third {
      @Value("Black")
      public String color;
      @GetMapping("/day1(3)")
      public String getMyfav() {
    	  return "My fav color is "+color;
      }
}
