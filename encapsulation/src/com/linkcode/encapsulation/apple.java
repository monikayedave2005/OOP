package com.linkcode.encapsulation;

public class apple extends Fruit{
	String color;
	int count;
	String taste;
	int price;
	
	public void taste() {
		System.out.println("Sweet in taste");
	}
	public void display() {
		System.out.println("Colour : "+this.color);
		System.out.println("Taste: "+this.taste);
		System.out.println("Price : "+this.price);
		System.out.println("No of fruits : "+count);
		
	}
	public static void main(String[] args) {
		apple Apple=new apple();
		Apple.color="red";
		Apple.price=200;
		Apple.taste="sweet";
		Apple.count=10;
		Apple.display();
		Apple.purpose();
		
	}
}
