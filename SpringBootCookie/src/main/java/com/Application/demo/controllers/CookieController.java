package com.Application.demo.controllers;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class CookieController {

	@GetMapping("/set-cookie")
	public String setCookie(HttpServletResponse response) {
		Cookie cookie = new Cookie("username", "sowmya");
		cookie.setMaxAge(60);
		cookie.setPath("/");
		
		response.addCookie(cookie);
		return "Cookie has been sent";
	}
	
	@GetMapping("/get-cookie")
	public String getCookie(@CookieValue(value="username" , defaultValue = "No cookie found") String username) {
		return "Cookie value is: " + username;
	}
}
