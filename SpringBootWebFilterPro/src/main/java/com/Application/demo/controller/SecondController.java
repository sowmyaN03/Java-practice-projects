package com.Application.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class SecondController {

	@GetMapping("/msg2")
	public String displayMessage2(HttpServletRequest req) {
		String checked = (String) req.getAttribute("checked");
		
		if("TRUE".equals(checked)) {
			return "Second controller";
		}
		else {
			return "Something wrong";
		}
	}
}
