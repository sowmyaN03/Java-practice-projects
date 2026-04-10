package com.Application.demo.service;

import org.springframework.stereotype.Service;

import com.Application.demo.entity.Student;

@Service
public class StudentService {
	
	public Student getStudent(int roll, String name, int age, String gender, String email) {
		Student st = new Student(roll, name, age, gender, email);
		return st;
	}
	
}
