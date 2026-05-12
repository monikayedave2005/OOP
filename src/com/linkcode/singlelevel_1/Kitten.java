package com.linkcode.singlelevel_1;

public class Kitten extends Cat {
	String kName;
	int age;
	String kColor;
	
	public Kitten(String kname,int kage,String kcolor,String cname,String ccolor,int cage,int no) {
		super(cname,ccolor,cage,no);
		this.kName=kname;
		this.age=kage;
		this.kColor=kcolor;
	}
	
	
public static void main(String[] args) {
	Kitten kitten=new Kitten("Babby",2,"Black","Mom","White",5,3);
	System.out.println("-------CAT INFO-------");
	System.out.println("Kitten name : "+kitten.kName);
	System.out.println("Kitten age : "+kitten.age);
	System.out.println("Kitten color : "+kitten.kColor);
	System.out.println("Cat name : "+kitten.getCname());
	System.out.println("Cat color : "+kitten.color);
	System.out.println("Cat age :"+kitten.age);
	System.out.println("Cat no of kittens : "+kitten.noOfKittens);
}
}
