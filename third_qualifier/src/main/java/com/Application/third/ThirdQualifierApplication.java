package com.Application.third;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThirdQualifierApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(ThirdQualifierApplication.class, args);
		Student st = ac.getBean(Student.class);
		st.study();
		st.workingWithDevice();
	}

}
