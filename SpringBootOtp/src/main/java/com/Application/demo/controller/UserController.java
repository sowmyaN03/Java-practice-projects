package com.Application.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Application.demo.entity.User;
import com.Application.demo.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String SignUpPage() {
		return "index";
	}
	
	@PostMapping("/register")
	public String registerUser(@ModelAttribute User user) {
		userService.register(user);
		System.out.println("Registration successful");
		return "login";
	}
	
	@GetMapping("/login")
	public String displayLoginPage() {
		return "login";
	}
	
	@PostMapping("/login")
	public String loginUser(@RequestParam String email, @RequestParam String password) {
		boolean status = userService.loginAndGenerateOtp(email, password);
		if(status == true) {
			return "otp";
		}
		else {
			return "loginFail";
		}
	}
	
	@PostMapping("/verifyOTP")
	public String verifyOTP(@RequestParam String otp) {
		boolean status = userService.verifyOtp(otp);
		if(status == true) {
			return "HomePage";
		}
		else {
			return "loginFail";
		}
	}
}
