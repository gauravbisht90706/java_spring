package com.gaurav.spring.springcore.lifecyclemethods;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//Using spring life cycle method with the help of spring Interface
public class Student implements InitializingBean, DisposableBean {

	private String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting Student's name");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
            System.out.println("This is a INIT bean");
		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("This is a Destroy bean");
		
	}

	
	
	
	
}
