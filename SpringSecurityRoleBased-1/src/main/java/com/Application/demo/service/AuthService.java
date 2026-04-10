package com.Application.demo.service;

import org.springframework.stereotype.Service;

import com.Application.demo.dto.UserRequest;
import com.Application.demo.entity.Role;
import com.Application.demo.entity.User;
import com.Application.demo.repository.UserRepository;

@Service
public class AuthService {
	
	UserRepository userRepo;
	
	public AuthService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	public String authUser(UserRequest userReq) {
		
		User user = userRepo.findByName(userReq.getName()).orElse(null);
		
		if(user.getPassword().equals(userReq.getPassword())) {
			if(user.getRole() == Role.ADMIN) {
				return "Welcome Admin";
			}
			else {
				return "Welcome User!";
			}
		}
		else {
			return "Invalid credentials";
		}
	}
}
