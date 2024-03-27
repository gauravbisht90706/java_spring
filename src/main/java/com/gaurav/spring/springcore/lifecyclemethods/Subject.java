package com.gaurav.spring.springcore.lifecyclemethods;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//Using Spring life cycle method with the help of Annotation
public class Subject {

	private String course;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Subject [course=" + course + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("This is a init menthod for subject bean");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("This is a destroy method for subject bean");
	}
	
		
}
