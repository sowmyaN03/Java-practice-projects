package com.Application.Second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

		Laptop ref;
		
		void study() {
			System.out.println("Student is studying");
		}

		void useLaptop() {
			ref.work();
		}
		
		@Autowired // not mandatory
		public Student(Laptop ref) {
			this.ref = ref;
		}
		
		
}
