package com.gaurav.spring.springcore.beanscope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("friend")
@Scope("prototype")
public class Friend {


	@Value("Gaurav Bisht")
	private String name;
	@Value("Pune")
	private String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Friend [name=" + name + ", city=" + city + "]";
	}
	
	
	
	
	
	
}
