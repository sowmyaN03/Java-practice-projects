package com.Application.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class ThirdController {
	
	@GetMapping("/msg3")
	public String displayMessage3(HttpServletRequest req) {
		String checked = (String) req.getAttribute("checked");
		
		if("TRUE".equals(checked)) {
			return "Third controller";
		}
		else {
			return "Something wrong";
		}
	}
}
