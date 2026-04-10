package com.Application.demo.controller;

import java.util.Date;

import javax.crypto.SecretKey;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api")
public class JWTController {
private final SecretKey SIGNING_KEY = Keys.secretKeyFor(SignatureAlgorithm.HS512); 
	
	@GetMapping("/generate-token") 
	public String generateToken(@RequestParam String username, @RequestParam String role, HttpServletResponse response) { 
		String token = Jwts.builder() 
				.setSubject(username) 
				.claim("role", role) 
				.setIssuedAt(new Date()) 
				.setExpiration(new Date(System.currentTimeMillis() + 3600000)) // Token valid for 1 hour 
				.signWith(SIGNING_KEY) 
				.compact(); 
		Cookie cookie = new Cookie("authToken", token);
		cookie.setHttpOnly(true);
		cookie.setMaxAge(600);
		cookie.setPath("/");
		
		response.addCookie(cookie);
		
		return "JWT stored inside cookie";
	}
	
}