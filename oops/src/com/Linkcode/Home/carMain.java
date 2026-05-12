package com.Linkcode.Home;

import java.util.Scanner;

public class carMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("*****CAR DETAILS*****");
	System.out.println("How many details you want to add : ");
	int n=sc.nextInt();
	
	car arr[]=new car[n];//used to store the address of object car
	for(int i=0;i<n;i++) {
		System.out.println("Enter car details for car no : "+(i+1));
		System.out.println("$$$*-----WELCOME TO CAR SHOPEE----*$$$");
		System.out.println("Enter Car type : ");
		String type=sc.next();
		System.out.println("Enter car company : ");
		String company=sc.next();
		System.out.println("Enter car color : ");
		String color=sc.next();
		System.out.println("Enter car price ");
		double price=sc.nextDouble();
		arr[i]=new car(type,company,color,price);
	}
	System.out.println("Details Accepted Successfully");
	System.out.println("$$$$======== CAR DETAILS =======$$$$");
	for(int i=0;i<n;i++) {
		System.out.println("Car Type : "+arr[i].type);
		System.out.println("Car Company : "+arr[i].company);
		System.out.println("Car Color : "+arr[i].color);
		System.out.println("Car Price : "+arr[i].price);
		System.out.println("$$=================================$$");
		
	}
	
	}
}

