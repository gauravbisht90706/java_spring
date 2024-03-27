package com.gaurav.spring.springcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/gaurav/spring"
				+ "/springcore/reftypes/setConfig.xml");
		
		Student student = (Student) ctx.getBean("student");
		Student student2 = (Student) ctx.getBean("Student2");
		System.out.println(student.getScores());
		System.out.println(student2.getScores());
		
		}

}
