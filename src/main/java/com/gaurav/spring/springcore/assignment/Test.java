package com.gaurav.spring.springcore.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/gaurav/spring"
				+ "/springcore/assignment/setConfig.xml");
		
		ShoppingCart cart = (ShoppingCart) ctx.getBean("shoppingCart");
		System.out.println(cart.getItems());
		System.out.println(cart);
		
		

		}

}
