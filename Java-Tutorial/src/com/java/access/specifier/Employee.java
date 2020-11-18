package com.java.access.specifier;

public class Employee {
	
	public String name;
	private String add;
	
	
	
	public Employee(String name,String add) {
		this.name=name;
		this.add=add;
	}
	
	public void getDetails() {
		System.out.println("Employee Details");
	}
	
	void getTechnology() {
		System.out.println("Technology");
	}
	
	protected void getAddress() {
		System.out.println("Address");
	}

}
