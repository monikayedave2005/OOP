package com.linkcode.collectionframework;
import java.util.HashSet;
public class HashSet1 {
	public static void main(String[] args) {
//		1.heterogenous
		
		HashSet set=new HashSet();
		set.add(10);
		set.add("hello");
		set.add(true);
//		2.does not add duplicates
		set.add(10);
		System.out.println(set);
		System.out.println(set.isEmpty());
//		System.out.println(set.get(3));
		System.out.println(set.contains("hello"));
		HashSet set1=new HashSet();
		set1.add(20);
		set1.add("MOTO");
		set1.add(false);
		System.out.println(set1);
		set1.add(set);
		set1.addAll(set);
		System.out.println(set1);
//		System.out.println(set1.getFirst());
//		 System.out.println(obj1.getLast());
//		 System.out.println(set.equals(set1));
////		 System.out.println(set1.indexOf("hello"));
//		 set.remove(10);
//		 set.remove("hello");
//		 System.out.println(set1);
////		 System.out.println(set1.get(1));
//		 set1.removeAll(set);
//		 set1.retainAll(set);
//		 System.out.println(set1);
//		 System.out.println(set);
		
	}
}
