package com.linkcode.collectionFramework_examples;

import java.util.ArrayList;
import java.util.Scanner;


public class Shopping_Cart {
	//ArrayList example
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Product> products= new ArrayList<Product>();
	
public static void main(String[] args) {
	boolean flag=true;
	while(flag) {
		System.out.println("-------Shopping Cart--------");
		System.out.println("1.Add cart ");
		System.out.println("2.Remove cart");
		System.out.println("3.display cart");
		System.out.println("4.Exit");
		System.out.println("Enter your choice : ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1-> addCart();
		case 2-> removeCart();
		case 3-> displayCart();
		case 4-> flag=false;
		}
	}
	
}
private static void displayCart() {
	System.out.println("--------- List----------");
	System.out.println("---------------------------------------------------------------------------------------------------------------");
	System.out.println("|   Product id  |     Product Name       |    Product Price     |   Product Quantity  |    Total Amount   |");
	System.out.println("---------------------------------------------------------------------------------------------------------------");

	for(Product pr:products) {
		System.out.println("|\t"+pr.getId()+"\t|\t "+pr.getPname()+" \t\t|\t"+pr.getPrice()+"\t\t|\t"+pr.getQn()+"\t\t|\t"+pr.getQn()*pr.getPrice()+"\t\t|");
	}
}
private static void removeCart() {
	System.out.println("Enter product id to remove : ");
	int id=sc.nextInt();
	Product product=findProductByID(id);
	if(product!=null) {
		System.out.println("Product found ");
		products.remove(product);
	}else {
		System.out.println("Product not found");
	}
	
	
}private static Product findProductByID(int id) {

	for(Product pr : products) {
		if(pr.getId()== (id)) {
			return pr;
		}
	}

	return null;
		
	}
private static void addCart() {
	System.out.println("Enter product Id : ");
	int id=sc.nextInt();
	System.out.println("Enter Product name : ");
	String name=sc.next();
	System.out.println("Enter product price : ");
	double price=sc.nextDouble();
	System.out.println("Enter product quantity : ");
	int qn=sc.nextInt();
	
	
	products.add(new Product(id,name,price,qn));
	System.out.println("Product added successfully");
	
}
}
