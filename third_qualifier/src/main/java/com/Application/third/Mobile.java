package com.Application.third;

import org.springframework.stereotype.Component;

@Component("mob")
public class Mobile implements ElectronicDevice {
	public void useDevice() {
		System.out.println("Mobile is getting used");
	}
}
