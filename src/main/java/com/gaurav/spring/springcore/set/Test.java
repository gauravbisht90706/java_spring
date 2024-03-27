package com.gaurav.spring.springcore.set;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/gaurav/spring/springcore/set/setConfig.xml");
		CarDealer car = (CarDealer) ctx.getBean("car");
		System.out.println(car.getName());
		System.out.println(car.getModels());
		

	}

}
