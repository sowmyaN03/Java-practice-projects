package com.Application.third;

import org.springframework.stereotype.Component;

@Component
public class Student {
	ElectronicDevice ref;
	
	void study() {
		System.out.println("Student is studying");
	}
	
	void workingWithDevice() {
		ref.useDevice();
	}

	public Student(ElectronicDevice ref) {
		super();
		this.ref = ref;
	}
	
	
}
