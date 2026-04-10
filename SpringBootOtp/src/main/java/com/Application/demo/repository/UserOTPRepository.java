package com.Application.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Application.demo.entity.UserOtp;

public interface UserOTPRepository extends JpaRepository<UserOtp, Integer>{
	UserOtp findByOtp(String otp);
}
