package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		l1.add("Abc");
		l1.add("DEF");
		l1.add("XYZ");
		
		System.out.println("The list is :"+l1);
		//iterate through iterator
		
		Iterator<String> itr=l1.iterator();
		ListIterator<String> listiterator=l1.listIterator();
		while(listiterator.hasPrevious()) {
			System.out.println("List iterator :"+listiterator.previous());
		}
		while(itr.hasNext()) {
			//l1.add("MNO");
			//l1.remove(0);
			System.out.println("Iterate through iterator "+itr.next());
			itr.remove();
		}
		l1.add("L");
		//iteratte through for-each
		l1.get(0);
		for(String name :l1)
			System.out.println("Iterate through for-each "+name);
		//iterate through stream
		l1.stream().forEach(t -> System.out.println("Iterate through Lambda " +t));
	}

}
