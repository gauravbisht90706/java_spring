package com.gaurav.spring.springcore.constinject;

import java.util.List;

public class Student {

	private String name;
	private int roll_no;
	private Certification certificate;
	private List<String> opt_courses; 
	
	public Student(String name, int roll_no, Certification certificate, List<String> opt_courses) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.certificate = certificate;
		this.opt_courses = opt_courses;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", roll_no=" + roll_no + " certificate=" + 
	  certificate.c_name + " Duration " + certificate.duration + " Courses Opted " + opt_courses + "]";
	}
	
	
	
	
	
}
