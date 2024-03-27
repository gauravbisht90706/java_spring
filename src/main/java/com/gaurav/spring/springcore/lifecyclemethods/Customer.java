package com.gaurav.spring.springcore.lifecyclemethods;

//Using spring life cycle method with the help of XML file
public class Customer {

	private int customer_id;

	public int getCustomer_id() {
		return customer_id;
	}
	
	public void setCustomer_id(int customer_id) {
		System.out.println("Setting property");
		this.customer_id = customer_id;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + "]";
	}
	
	public void init() {
		System.out.println("Calling Init method");
	}
	
	public void destroy() {
		System.out.println("Calling destroy method");
	}
	
	
	
}
