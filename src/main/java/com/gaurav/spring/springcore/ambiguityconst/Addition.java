package com.gaurav.spring.springcore.ambiguityconst;

public class Addition {

	private int a;
	private int b;
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "Addition ["+ a+b +"]";
	}

	public Addition(double a, double b) {
		System.out.println("Calling double constructor");
		this.a = (int)a;
		this.b = (int)b;
		
		}

//	public Addition(String a, String b) {
//		System.out.println("Calling String constructor");
//		this.a = Integer.parseInt(a);
//		this.b = Integer.parseInt(b);
//		
//	}
	
}
