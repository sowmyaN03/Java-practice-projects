package com.Application.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Application.demo.entity.User;
import com.Application.demo.repository.UserRepository;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    public User authenticate(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user == null) throw new RuntimeException("User not found!");
        if (!user.getPassword().equals(password)) throw new RuntimeException("Invalid credentials!");
        return user;
    }
}
