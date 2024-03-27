package com.gaurav.spring.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/gaurav/spring/springcore"
				+ "/collections/collection_config.xml");
		
		Employee emp1 = (Employee) ctx.getBean("employee1");
		System.out.println("Below is the Employee Info:");
		System.out.println(emp1.getName());
		System.out.println(emp1.getCity());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getPhone_no());
		

	}

}
