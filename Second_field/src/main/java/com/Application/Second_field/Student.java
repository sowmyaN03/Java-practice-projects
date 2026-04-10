package com.Application.Second_field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

		@Autowired
		Laptop ref;
		
		void study() {
			System.out.println("Student is studying");
		}

		void useLaptop() {
			ref.work();
		}
		
}
