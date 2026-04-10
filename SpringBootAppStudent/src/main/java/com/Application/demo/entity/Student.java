package com.Application.demo.entity;

public class Student {

	int roll;
	String name;
	int age;
	String gender;
	String email;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int roll, String name, int age, String gender, String email) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}

	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
