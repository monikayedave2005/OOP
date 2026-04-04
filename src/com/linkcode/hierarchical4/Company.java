package com.linkcode.hierarchical4;

public class Company {
	String cName;
	int noOfEmp;
	String dept;
	
	public Company(String cname,int no,String dep) {
		this.cName=cname;
		this.noOfEmp=no;
		this.dept=dep;
	}
	public void displayInfo() {
		System.out.println("---COMPANY DATA----");
		System.out.println("Comapny Name : "+cName);
		System.out.println("Total Employee : "+noOfEmp);
		System.out.println("Department Type : "+dept);
	}
	
}
