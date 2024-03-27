package com.gaurav.spring.springcore.standalonecollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Friends {

	private List<String> name;
	private Map<String, Integer> age;
	private Properties course;

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Friends [name=" + name + " " + "]";
	}

	public Map<String, Integer> getAge() {
		return age;
	}

	public void setAge(Map<String, Integer> age) {
		this.age = age;
	}

	public Properties getCourse() {
		return course;
	}

	public void setCourse(Properties course) {
		this.course = course;
	}

	
	
	
	
}
