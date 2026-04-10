package com.Application.Second_field;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecondFieldApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SecondFieldApplication.class, args);
		Student st = ac.getBean(Student.class);
		st.study();
		st.useLaptop();
	}

}
