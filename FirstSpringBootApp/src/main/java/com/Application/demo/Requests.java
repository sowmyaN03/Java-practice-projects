package com.Application.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller is used we the method returns html file like return "index.html"
@RestController   // also nothing but @Controller + ResponseBody
@RequestMapping("/greeting")
public class Requests {

	@GetMapping("/greet")
	//@ResponseBody is used if the direct message is returned. 
	public String greet() {
		return " Hello from Spring Boot";
	}
}
