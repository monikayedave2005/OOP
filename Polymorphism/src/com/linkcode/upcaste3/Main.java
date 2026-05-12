package com.linkcode.upcaste3;

public class Main {
public static void main(String[] args) {
	//upcasting
//	Circle c=new Circle();
//	c.getArea();
//	c.cArea();
//	Shape s=c;//child ref is stored in parent ref
//	s.getArea();
//	Rectangle rect=new Rectangle();
//	rect.getArea();
//	rect.rArea();
	
	//downcasting
	Shape s=new Circle();
	Circle c=(Circle)s;
	c.cArea();
	c.getArea();
	Shape s1=new Rectangle();
	Rectangle rect=(Rectangle)s1;
	rect.rArea();
	rect.getArea();
	
	
			
	
	
	
}
}
