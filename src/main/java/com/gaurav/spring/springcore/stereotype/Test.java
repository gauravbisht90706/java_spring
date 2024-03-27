package com.gaurav.spring.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/gaurav/spring"
				+ "/springcore/stereotype/config.xml");
		
		Student student = context.getBean("student_info",Student.class);
		System.out.println(student);
		System.out.println(student.getClass().getName());
		System.out.println(student.getCourses());
		
		

	}

}
