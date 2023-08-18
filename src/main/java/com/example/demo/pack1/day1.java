package com.example.demo.pack1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class day1 {
	@RequestMapping("day1")
	@ResponseBody
public String Welcome() {
	return "Welcome String Boot"; 
}
}
