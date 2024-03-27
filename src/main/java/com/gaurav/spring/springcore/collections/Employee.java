package com.gaurav.spring.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private String name;
	private List<Integer> phone_no;
	private Set<String> city;
	private Map<String,String> courses;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(List<Integer> phone_no) {
		this.phone_no = phone_no;
	}
	public Set<String> getCity() {
		return city;
	}
	public void setCity(Set<String> city) {
		this.city = city;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone_no=" + phone_no + ", city=" + city + ", courses=" + courses + "]";
	}
	
	
	
}
