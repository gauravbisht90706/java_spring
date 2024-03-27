package com.gaurav.spring.springcore.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/gaurav/spring/"
				+ "springcore/beanscope/config.xml");
		
		Friend friend = context.getBean("friend", Friend.class);
		
		System.out.println(friend);
		System.out.println(friend.hashCode());
		
		Friend friend2 = context.getBean("friend", Friend.class);
		
		// to print hashcode of class to validate prototype scope
		System.out.println(friend2.hashCode());
		
	}

}
