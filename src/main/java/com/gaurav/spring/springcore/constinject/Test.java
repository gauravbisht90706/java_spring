package com.gaurav.spring.springcore.constinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/gaurav/spring/"
				+ "springcore/constinject/constinjectconfig.xml");
		Student student1 = (Student) ctx.getBean("student1");
		Student student2 = (Student) ctx.getBean("student2");
		
		
		System.out.println(student1);
		System.out.println(student2);
		

	}

}
