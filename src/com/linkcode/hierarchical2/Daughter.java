package com.linkcode.hierarchical2;

public class Daughter extends Parents{
	String dName;
	int dAge;
	String dSchool;
	int cont1No;
	
	public Daughter(String pName,int pAge,String pAddr,int conNo,String dName,int dAge,String dSchool,int cont1No){
		super(pName,pAge,pAddr,conNo);
		this.dName=dName;
		this.dAge=dAge;
		this.dSchool=dSchool;
		this.cont1No=cont1No;
	}
}
