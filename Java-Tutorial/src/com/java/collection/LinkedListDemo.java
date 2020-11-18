package com.java.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l1=new LinkedList<>();
		l1.add("A");
		l1.add("C");
		l1.addFirst("X");
		l1.addLast("M");
		l1.add(2, "N");
		l1.add("J");
		l1.set(2, "N+");
		
	
		System.out.println(l1);
		
	}

}
