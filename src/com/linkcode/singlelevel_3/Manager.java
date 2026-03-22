package com.linkcode.singlelevel_3;

public class Manager extends Empioyee {
	String department;
	
	public Manager(String depart,String name,double salary) {
		super(name,salary);
		this.department=depart;
	}
	public static void main(String[] args) {
		Manager man=new Manager("Developing","Arihant",500000);
		System.out.println();
		System.out.println("----Manager data----");
		System.out.println();
		System.out.println("Department : "+man.department);
		System.out.println("Name : "+man.name);
		System.out.println("Salary : "+man.getSalary());
	}
}
