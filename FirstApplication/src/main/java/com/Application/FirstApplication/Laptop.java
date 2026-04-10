package com.Application.FirstApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

    int id = 101;
    String brand = "Dell";

    @Autowired
    OS os;   // Inject OS object automatically

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int id, String brand, OS os) {
		super();
		this.id = id;
		this.brand = brand;
		this.os = os;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public OS getOs() {
		return os;
	}

	public void setOs(OS os) {
		this.os = os;
	}

    
}
