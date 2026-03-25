package com.linkcode.singlelevel_4;



public class Car extends Vehicle {
	String cname;
	int cprice;
	
	public Car(String cname, int cprice,String type,double price,String fuel, int no) {
		super(type,price,fuel,no);
		this.cname=cname;
		this.cprice=cprice;
	}
	public void carInfo() {
		
		System.out.println("Car company : "+cname);
		System.out.println("Car price : "+cprice);
		displayInfo();
	}
	public static void main(String[] args) {
		Car car=new Car("Skoda",5000000,"4wheeler",6000000,"Petrol",4);
		car.carInfo();
	}
}
