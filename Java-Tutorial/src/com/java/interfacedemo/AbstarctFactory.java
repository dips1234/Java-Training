package com.java.interfacedemo;

public abstract class AbstarctFactory implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Abstract");
	}
	
	public abstract void display();
	

}
