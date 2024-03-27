package com.gaurav.spring.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student student = context.getBean("student", Student.class);
		
		student.study();

	}

}
