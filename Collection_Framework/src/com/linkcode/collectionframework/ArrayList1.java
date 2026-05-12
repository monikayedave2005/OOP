package com.linkcode.collectionframework;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add(10);
		obj.add("Hello");
		obj.add(true);
		obj.add(10);
		obj.add(false);
		obj.add(1,90);
		System.out.println(obj);
		 System.out.println(obj.isEmpty());
		 System.out.println(obj.get(1));
		 System.out.println(obj.contains(10));
		 ArrayList obj1=new ArrayList();
		 obj1.add(20);
		 obj1.addAll(obj);
		 obj1.add(obj);
		 System.out.println(obj1);
//		 System.out.println(obj1.getFirst());
//		 System.out.println(obj1.getLast());
		 System.out.println(obj1.equals(obj1));
		 System.out.println(obj1.indexOf("hello"));
		 obj1.remove(2);
		 obj1.remove("hello");
		 System.out.println(obj1);
		 System.out.println(obj1.get(1));
		 obj1.removeAll(obj);
		 obj1.retainAll(obj);
		 System.out.println(obj1);
		 System.out.println(obj);

// 1: normal for loop
		System.out.println("1:Normal for loop");
		for(int i=0;i<obj.size();i++) {
			System.out.println(obj.get(i));
		 }
		System.out.println("2.Advanced For loop");

		// 2.advance for loop

		for(Object a:obj) {
			System.out.println(a);
			}
		System.out.println("3.For each Loop");

//
//		// 3.for each loop 
//
//		// functional progamming 
//
//		 obj.forEach(val->System.out.println(val));
//
//		// 4.advanced ways(print) 
		 System.out.println("4.advanced easy way");
//		 obj.forEach(System.out::println);
//	}
//	
	}
}
