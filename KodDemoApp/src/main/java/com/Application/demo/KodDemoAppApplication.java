package com.Application.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class KodDemoAppApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(KodDemoAppApplication.class, args);
		Laptop laptop = ac.getBean(Laptop.class);
		laptop.build();
	}

}
