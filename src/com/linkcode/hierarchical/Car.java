package com.linkcode.hierarchical;

public class Car extends Vehical{
	
	String cname;
	String color;
	int noOfWheels;
	
	public Car(int id, int capacity, String enginetype, String cname, String color, int wheels) {
		super(id,capacity,enginetype);
		this.cname=cname;
		this.color=color;
		this.noOfWheels=wheels;
	}
	
	
}
