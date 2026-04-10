package com.Application.fourth;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	int deptId;
	String deptName;
	
	void details() {
		System.out.println("Department Id: " + deptId);
		System.out.println("Department Name: " + deptName);
	}
	
	public Department(@Value("${department.deptId}") int deptId, @Value("${department.deptName}") String deptName) { 
		this.deptId = deptId;
		this.deptName = deptName;
	}

	
	
}
