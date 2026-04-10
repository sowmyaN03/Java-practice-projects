package com.Application.third;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ThirdApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(ThirdApplication.class, args);
		Student st = ac.getBean(Student.class);
		st.study();
		st.workingWithDevice();
	}

}
