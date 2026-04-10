package com.Application.third;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mobile implements ElectronicDevice {
	public void useDevice() {
		System.out.println("Mobile is getting used");
	}
}
