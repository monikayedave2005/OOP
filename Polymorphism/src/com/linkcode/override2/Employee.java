package com.linkcode.override2;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String addr;
	public Employee(int id, String name, double salary, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.addr = addr;
	}
	public void displayInfo() {
		System.out.println("Emp id  : "+this.id);
		System.out.println("Name    : "+this.name);
		System.out.println("Salary  : "+this.salary);
		System.out.println("Address : "+this.salary);
		
	}
	public String toString(){
		return addr;
	}
	public int hashCode() {
		return id;
	}
	public boolean equals(Object obj) {
		return(this.name==((Employee)obj).name);
}
}
