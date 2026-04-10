package com.Application.demo.entity;

@Entity
@Table
public class User {
	int id;
	String name;
	String password;
	Role role;
}
