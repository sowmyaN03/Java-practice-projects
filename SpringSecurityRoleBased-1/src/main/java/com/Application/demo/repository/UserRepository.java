package com.Application.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Application.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	Optional<User> findByName(String name);
}
