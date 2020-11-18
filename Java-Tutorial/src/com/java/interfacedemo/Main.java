package com.java.interfacedemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstarctFactory abf=new AbstarctFactory() {
			
			@Override
			public void display() {
				// TODO Auto-generated method stub
				
			}
		};
		
		//AbstarctFactory af1=new AbstarctFactory();
		FactoryImpl fi=new FactoryImpl() {
		};
		fi.display();
		Shape s1= new Shape() {
			
			@Override
			public void draw() {
				// TODO Auto-generated method stub
				System.out.println("Inside Shape");
			}
		};
		s1.draw();
		AbstractDemo ad=new AbstractDemo() {
		};
	}

}
