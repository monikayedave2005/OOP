package com.linkcode.singlelevel_4;

public class Vehicle {
	String type;
	double price;
	String fuel;
	int noOfWheels;
	
	public Vehicle(String type,double price,String fuel,int no) {
		this.type=type;
		this.price=price;
		this.fuel=fuel;
		this.noOfWheels=no;
	}
	public void displayInfo() {
		System.out.println("Type : "+type);
		System.out.println("Price : "+price);
		System.out.println("Fuel :"+fuel);
		System.out.println("No of Wheels : "+noOfWheels);
		
	}
	
}
