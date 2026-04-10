package com.Application.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@Controller
public class OS {
	public void operating() {
		System.out.println("Operating system is operating.");
	}
}
