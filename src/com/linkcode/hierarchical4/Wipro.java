package com.linkcode.hierarchical4;

public class Wipro extends Company{
	String name;
	double Salary;
	double turn;
	
	public Wipro(String cname,int no,String dep,String name,double salary,double turn) {
		super(cname,no,dep);
		this.name=name;
		this.Salary=salary;
		this.turn=turn;
		
	}
	public void empInfo () {
		displayInfo();
		System.out.println("----Employee Data----");
		System.out.println("Empoyee Name : "+name);
		System.out.println("Employee Salary : "+Salary);
		System.out.println("Turnover : "+turn);
	}
	

}
