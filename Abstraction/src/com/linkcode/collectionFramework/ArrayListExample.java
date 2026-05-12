package com.linkcode.collectionFramework;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		// used to stored different data types by creatin object
		ArrayList obj=new ArrayList();
		obj.add(10);
		obj.add("hello");
		obj.add(true);
		System.out.println(obj);
//		System.out.println(obj.get(3));
//      1.normal for loop
//		for(int i=0;i<obj.size();i++) {
//			System.out.println(obj.get(i));                     
//		}
////		2.enhanced for loop
//		for(Object a :obj) {
//			System.out.println(a);
//		}
////		3. foreach method
//		obj.forEach(val->System.out.println(val));
//		//4.reduced easy
//		obj.forEach(System.out::println);
		
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
		System.out.println(obj.get(0));
		System.out.println(obj.contains("hello"));
		obj.remove(Integer.valueOf(10));
		System.out.println(obj);
		
	}
}
