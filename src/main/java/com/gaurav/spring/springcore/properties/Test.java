package com.gaurav.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/gaurav/spring"
				+ "/springcore/properties/setConfig.xml");
		
		CountriesLanguages cl = (CountriesLanguages) ctx.getBean("countryLanguage");
		System.out.println(cl.getCountryAndLangs());
		

		}

}
