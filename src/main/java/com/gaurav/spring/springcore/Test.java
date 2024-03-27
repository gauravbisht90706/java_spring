package com.gaurav.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		//Injecting primitive type data
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println("Employee id: "+emp.getId());
		System.out.println("Employee name: "+emp.getName());
		
		Employee emp1 = (Employee) ctx.getBean("emp1");
		System.out.println("Employee name: "+ emp1.getId());
		System.out.println("Employee name: "+ emp1.getName());
		
		Employee emp2 = (Employee) ctx.getBean("emp2");
		System.out.println("Employee id: "+emp2.getId());
		System.out.println("Employee name: "+emp2.getName());
		
		
		

	}

}
