package com.gaurav.spring.springcore.set;

import java.util.Set;

public class CarDealer {
	
	private String name;
	private Set<String> models;
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
	 * @return the models
	 */
	public Set<String> getModels() {
		return models;
	}
	/**
	 * @param models the models to set
	 */
	public void setModels(Set<String> models) {
		this.models = models;
	}
	
	

}
