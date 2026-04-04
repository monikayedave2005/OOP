package com.linkcode.multilevel2;

public class Teacher extends HOD{
	String tName;
	String subname;
	int tconNo;
	
	public Teacher(String tName,String subname,int tconno,String name,int no,String gender,String hname1,int id,String branch) {
		super(name,no,gender,hname1,id,branch);
		this.tName=tName;
		this.subname=subname;
		this.tconNo=tconno;
		
	}
}
