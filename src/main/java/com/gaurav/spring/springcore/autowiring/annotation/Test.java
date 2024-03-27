package com.gaurav.spring.springcore.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/gaurav/spring/"
				+ "springcore/autowiring/annotation/config.xml");
		
		Employee employee = context.getBean("employee",Employee.class);
		
		System.out.println(employee);

	}

}