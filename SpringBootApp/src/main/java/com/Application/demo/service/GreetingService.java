package com.Application.demo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	public String generateMessage(String name) {
		return "Hello " + name + " Welcome To Kodnest";
	}
}
