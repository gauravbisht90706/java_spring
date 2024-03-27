package com.gaurav.spring.springcore.list;

import java.util.List;

public class Hospital {

	private String name;
	private List<String> departments;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the departments
	 */
	public List<String> getDepartments() {
		return departments;
	}
	/**
	 * @param departments the departments to set
	 */
	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}
	

	
	
	
}
