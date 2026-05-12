package com.Linkcode.Home;

public class car {
	String type;
	String company;
	String color;
	Double price;
	
	public car(String type, String company, String color, Double price) {
		this.type = type;
		this.company = company;
		this.color = color;
		this.price = price;
	}
	
	public void display() {
		System.out.println("***Welcome to car shopeee***");
		System.out.println("Car type    : "+type);
		System.out.println("Car Company : "+company);
		System.out.println("Car Color   : "+color);
		System.out.println("Car Price   : "+price);
		System.out.println("=======================");
		
	}
	
}
