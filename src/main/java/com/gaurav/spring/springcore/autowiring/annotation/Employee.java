package com.gaurav.spring.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	@Autowired
	private Address address;
	
	private String name;
	private int id;
	
	public String getName() {
		return name;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Autowired
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Autowired
	public Employee(Address address) {
		this.address = address;
		System.out.println("Constructor of address class from Employee class");
	}
	
	@Override
	public String toString() {
		return "Employee [address=" + address + ", name=" + name + ", id=" + id + "]";
	}
	
	
	
}
