package com.Application.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Application.demo.entity.User;
import com.Application.demo.service.AuthService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/auth/login")
    public Map<String, String> login(@RequestBody Map<String, String> request) {
        String username = request.get("username");
        String password = request.get("password");
        User authenticatedUser = authService.authenticate(username, password);

        Map<String, String> response = new HashMap<>();
        response.put("username", authenticatedUser.getUsername());
        response.put("successMessage", "Login successful!");
        return response;
    }
}
