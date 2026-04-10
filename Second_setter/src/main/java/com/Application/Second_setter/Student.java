package com.Application.Second_setter;

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
		

		public Laptop getRef() {
			return ref;
		}
		@Autowired //madatory
		public void setRef(Laptop ref) {
			this.ref = ref;
		}
		
		
}

