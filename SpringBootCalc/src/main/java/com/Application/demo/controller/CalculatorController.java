package com.Application.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Application.demo.service.CalculatorService;

@Controller
public class CalculatorController {
	CalculatorService calcService;

	@Autowired
	public CalculatorController(CalculatorService calcService) {
		super();
		this.calcService = calcService;
	}
	
	@GetMapping("/")
	String welcome() {
		return "index";
	}
	
	@PostMapping("/percentage")
	String calculatePercentage(@RequestParam String username, @RequestParam int m1, @RequestParam int m2, @RequestParam int m3, Model model) {
		double per = calcService.calculatePer(m1, m2, m3);
		model.addAttribute("name", username);
		model.addAttribute("per", per);
		return "result";
	}
}
