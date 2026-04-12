package com.linkcode.singlelevel_1;

public class Cat {
	private String cName;
	String color;
	int age;
	int noOfKittens;
	
	public String getCname(){
		return this.cName;
	}
	
	
	
	public Cat(String cName,String ccolor,int cage,int no) {
		this.cName=cName;
		this.color=ccolor;
		this.age=cage;
		this.noOfKittens=no;
	}
	
	
	
}
