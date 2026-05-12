package com.linkcode.hierarchical2;

public class Son extends Parents{
	String sName;
	int sAge;
	String sSchool;
	int contNo;
	
	public Son(String name,int age,String addr,int conNo,String sname,int sage,String school,int contNo){
		super(name,age,addr,conNo);
		this.sName=sname;
		this.sAge=sage;
		this.sSchool=school;
		this.contNo=contNo;
	}
}
