package com.gaurav.spring.springcore.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/gaurav/spring"
			+ "/springcore/standalonecollections/config.xml");
	
	Friends friends = context.getBean("friends",Friends.class);
	
	System.out.println(friends);
	System.out.println(friends.getName().getClass().getName());
	System.out.println(friends.getAge());
	System.out.println(friends.getCourse());
	

	}

}
