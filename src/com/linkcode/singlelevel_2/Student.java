package com.linkcode.singlelevel_2;

public class Student extends Teacher {
	String sName;
	int sage;
	private double marks;
	
	public double getMarks() {
		return this.marks;
	}
	
	public Student(String name,int age,String sname,int sage,double mark) {
		super(name,age);
		this.sName=sname;
		this.sage=sage;
		this.marks=mark;
	}
	public void displayStudent() {
		displayTeacher();
		System.out.println("Student name : "+sName);
		System.out.println("Student Age : "+sage);
		System.out.println("Student marks : "+getMarks());
	}
	public static void main(String[] args) {
		Student stud=new Student("Prof.Kagne",40,"Monika",21,90);
		stud.displayStudent();
	}
}
