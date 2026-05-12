package com.linkcode.collectionFramework_examples;
import java.util.Scanner;
import java.util.TreeMap;

public class ECommerce {
	static TreeMap<Integer,String> products=new TreeMap<Integer,String>();
	static Scanner sc=new Scanner(System.in);
	//treemap example
public static void main(String[] args) {
	initializeProducts();
	boolean flag=true;
	while(flag) {
	System.out.println("----SHOPPING APP----");
	System.out.println("1.Add product");
	System.out.println("2.Display all products");
	System.out.println("3.Filter by range");
	System.out.println("4.sort by high to low");
	System.out.println("5.sort by low to high");
	System.out.println("6.Exit");
	System.out.println("-----------------------");
	System.out.println("Enter your choice : ");
	int ch=sc.nextInt();
	switch(ch) {
//	case 1->
	case 2-> displayProducts();
//	case 3->
//	case 4->
//	case 5->
	case 6->flag=false;
	default->System.out.println("Invalid choice");
	
	}
	}
	
}

	private static void initializeProducts() {
		
		products.put(500  ,"watch");
		products.put(1000 ,"Shoose");
		products.put(70000,"Laptop");
		products.put(2000 ,"Jwellery");
		products.put(50000,"Mobile");
		
	}
	private static void displayProducts() {
		System.out.println("------Produc List-------");
		products.forEach((key,val)->System.out.println(val+" : "+key));
		;
	}
}
