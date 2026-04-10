package com.Application.third;

import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop implements ElectronicDevice {
	public void useDevice() {
		System.out.println("Laptop is getting used");
	}
}
