package com.gaurav.spring.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {

	public void study() {
		System.out.println("This student is studying");
	}
	
	
}
