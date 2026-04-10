package com.Application.FirstApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(FirstApplication.class, args);
	
		 Laptop lap = ac.getBean(Laptop.class);

	        System.out.println(lap.getId());
	        System.out.println(lap.getBrand());
	        System.out.println(lap.getOs().getName());
	        System.out.println(lap.getOs().getVersion());
	}

}
