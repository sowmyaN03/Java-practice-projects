package com.Application.Second_setter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SecondSetterApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SecondSetterApplication.class, args);
		Student st = ac.getBean(Student.class);
		st.study();
		st.useLaptop();
	}

}
