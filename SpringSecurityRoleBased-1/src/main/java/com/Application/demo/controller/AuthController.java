package com.Application.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Application.demo.dto.UserRequest;
import com.Application.demo.service.AuthService;

@RestController
public class AuthController {
	
	AuthService authService;
	
	AuthController(AuthService authService) {
		this.authService = authService;
	}

	@PostMapping("/login")
	public String login(@RequestBody UserRequest userReq) {
		return authService.authUser(userReq);
	}
}
