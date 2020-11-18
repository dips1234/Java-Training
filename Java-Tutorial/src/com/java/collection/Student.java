package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
	
	private int id;
	private String name;
	private int age;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Student(int id, String name, int age) {
		//super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		/*
		 * if(this.getId()>o.getId()) return 1; else if(this.getId()<o.getId()) return
		 * -1; else return 0;
		 */
		return this.getId()-o.getId();
	}
	
	public static void main(String[] args) {
		
		Student s1= new Student(2, "Ram", 24);
		Student s2= new Student(4, "Shyam", 29);
		Student s3= new Student(8, "Xavier", 19);
		Student s4= new Student(1, "Kalyan", 21);
		List<Student> studentlist=new ArrayList<Student>();
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		studentlist.add(s4);
		//studentlist.sort(new AgeComparator());
		
		System.out.println("Studentlist before sorting :"+studentlist);
		Collections.sort(studentlist);
		System.out.println("Student List after sorting :"+studentlist);
		Collections.sort(studentlist,new AgeComparator());
		System.out.println("Student List after sorting Age :"+studentlist);
		Collections.sort(studentlist,new NameComparator());
		System.out.println("Student list after name :"+studentlist);
		
		
		
	}

}
