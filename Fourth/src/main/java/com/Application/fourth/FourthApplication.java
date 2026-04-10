package com.Application.fourth;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FourthApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(FourthApplication.class, args);
		Employee emp = ac.getBean(Employee.class);
		emp.work();
		emp.empDetails();
		emp.deptDetails();
	}

}
