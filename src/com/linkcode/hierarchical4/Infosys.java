package com.linkcode.hierarchical4;

public class Infosys extends Company {
	String name;
	int noOfemp;
	int salary;
	
	public Infosys(String cname,int no,String dep,String name,int noOfemp,int salary) {
		super(cname,no,dep);
		this.name=name;
		this.noOfEmp=noOfemp;
		this.salary=salary;
	}
	public void displayInfosys() {
		displayInfo();
		System.out.println("-----Empyoyee Data------");
		System.out.println("Emp name : "+name);
		System.out.println("Total Emp : "+noOfemp);
		System.out.println("Salary : "+salary);
	}
	
}
