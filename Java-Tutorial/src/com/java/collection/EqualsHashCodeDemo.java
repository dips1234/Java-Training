package com.java.collection;

import java.util.HashMap;
import java.util.HashSet;

public class EqualsHashCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee(1, "Snehashish", 3000); //created in heap with add 30
		Employee emp2=new Employee(1,"Snehashish",3000); //created in heap with add 35
		Employee emp3=new Employee(2,"Prasun",6700);
		Employee emp4=new Employee(3,"Sanjoy",7500);
		/*HashMap<Employee,String> hp=new HashMap<>();
		hp.put(emp1, "Employee1");
		hp.put(emp2, "Employee2");
		hp.put(emp3, "Employee3");
		hp.put(emp4, "Employee4");
		System.out.println("Employee with details :" +hp);*/
		
		HashSet<Employee> hs=new HashSet<>();
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		hs.add(emp4);
		
		System.out.println("Employee :"+hs);
		
		/*
		 * HashSet<String> h=new HashSet<>(); h.add("A"); h.add("B"); h.add("A");
		 * h.add("E");
		 * 
		 * System.out.println("String details :"+h);
		 */

	}

}
