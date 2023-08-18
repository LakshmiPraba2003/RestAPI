package com.example.demo.pack2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day1second {
        
        @Value("lakshmi")
        public String name;
        @GetMapping("/day1(2)")
        
        public String getName() {
        	return "Welcome "+name+" !";
        }
}
