package com.linkcode.singlelevel_2;

public class Teacher {
	String name;
	int age;
	
	public Teacher(String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	public void displayTeacher() {
		System.out.println("Name :"+name);
		System.out.println("Age : "+age);
	}
}
