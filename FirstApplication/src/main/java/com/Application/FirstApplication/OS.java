package com.Application.FirstApplication;

import org.springframework.stereotype.Component;

@Component
public class OS {

    String name = "Windows";
    String version = "11";
	public OS() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OS(String name, String version) {
		super();
		this.name = name;
		this.version = version;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
    
    
}
