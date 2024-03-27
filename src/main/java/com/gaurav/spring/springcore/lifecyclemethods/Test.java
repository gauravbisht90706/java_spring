package com.gaurav.spring.springcore.lifecyclemethods;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/gaurav/spring/springcore"
				+ "/lifecyclemethods/config.xml");
		//Registering shutdown hook for calling Destroy method for clean up activity
		context.registerShutdownHook();
		
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);
		
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		
		Subject subject = (Subject) context.getBean("subject");
		System.out.println(subject);
		
		
		
		
		

	}

}
