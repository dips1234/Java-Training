package com.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
	
	HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
	hashmap.put(1, "A");
	hashmap.put(2, "B");
	hashmap.put(3, "C");
	String m=hashmap.put(3, "A");
	System.out.println(m);
	hashmap.put(4, "D");
	System.out.println("Map is :"+hashmap);
	Set<Entry<Integer,String>> es=hashmap.entrySet();
	
	for(Map.Entry<Integer, String> mp: es) {
		Integer key= mp.getKey();
		String value=mp.getValue();
		System.out.println("Key value is :"+key);
		System.out.println("Value is :"+value);
	}
	
	//using lambda
	
	hashmap.entrySet().stream().forEach((obj) -> System.out.println(obj));
	hashmap.forEach((k,v) -> System.out.println(k +":" +v));
	
	}

	

}
