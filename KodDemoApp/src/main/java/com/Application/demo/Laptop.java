package com.Application.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Laptop {

    int id = 101;
    String brand = "Dell";

    OS os; 
    
//    @Autowired
//    public Laptop(OS os) {
//		super();
//		this.os = os;
//	}
    
  
    
    
    public void build() {
    	System.out.println("Building the 1st App");
    	os.operating();
    }

	public OS getOs() {
		return os;
	}
	
	@Autowired
	public void setOs(OS os) {
		this.os = os;
	}
	
}
