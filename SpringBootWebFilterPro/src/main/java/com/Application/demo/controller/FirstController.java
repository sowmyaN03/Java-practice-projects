package com.Application.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstController {

	@GetMapping("/msg1")
	public String displayMessage1() {
		System.out.println("First Controller Executed");
		return "First Controller";
	}
}
