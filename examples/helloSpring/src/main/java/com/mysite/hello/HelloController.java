package com.mysite.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody
	String hello() {
		return "hello from my first controller";
	}
	
	/*
	@RequestMapping("/tools")
	String tools() {
		return "Hello from my first Tools controller";
	}
	
	@RequestMapping("/hello")
	String hello1() {
		return "Hello from my new test controller";
	}
	*/

}
