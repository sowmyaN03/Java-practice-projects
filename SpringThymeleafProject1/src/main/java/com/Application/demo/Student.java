package com.Application.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/student")
public class Student {
	
//	@GetMapping("/details/{name}")
//	String showDetails(@PathVariable String name, Model m) {
//		m.addAttribute("message", name);
//		return "details";
//	}
	@GetMapping("/details")
	String showDetails(@RequestParam String name, @RequestParam int age, @RequestParam String gender) {
		return name + " " + age + " " + gender;
	}
}
//PathVariables is good to be used when only one variable input to be taken from client.
//For multiple variables its not preferred else request parameter i.e @requestParam is preferred