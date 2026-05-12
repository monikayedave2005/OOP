package com.linkcode.collectionFramework_examples;

import java.util.HashMap;

public class HashMap1 {
	//stored heterogenois data  stored in {}
	//key value pairs stored
	// key should not duplicate
	//does not follow insertion order
	// value should be duplicate
	//does not consist index values
public static void main(String[] args) {
	HashMap<String,Double> map=new HashMap<String,Double>();
	System.out.println(map);
	map.put("Rahul", 98.45);
	map.put("Riya", 86.76);
	map.put("Ram",74.45 );
	System.out.println(map);
	System.out.println(map.containsKey("Riya"));
	System.out.println(map.get("Ram"));
	System.out.println(map.isEmpty());
	System.out.println(map.containsValue(74.38));
	System.out.println(map.keySet());
	System.out.println(map.values());
	System.out.println(map.entrySet());
	
	
	//itrating hashmap
	//2. enhanced for loop
	
	for(String key:map.keySet()) {
		System.out.println(key+ ":"+map.get(key));
	}
	
	//3.foreach
	map.forEach((key,val)->System.out.println(key+":"+map.get(key)));
	
	//4.advanced forloop
	
}
}
