package com.gaurav.spring.springcore.ambiguityconst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext
				("com/gaurav/spring/springcore/ambiguityconst/setconfig.xml");
		
		Addition add = (Addition)context.getBean("addition");
		System.out.println(add);
		

	}

}
