package com.java.overloading;

public class Employee {
	
	public void getDetails() {
		System.out.println("Inside no-arg parent details");
	}
	
	public void getDetails(String a, String b) {
		System.out.println("Inside 2 arg parent details");
		
	}
	
	public void getDetails(String a) {
		System.out.print("Inside 1 arg parent details");
	}

	public void getDetails(String a, int b) {
		
	}
	public void hello() {
		System.out.println("inside parent hello");
	}
	
	
}
