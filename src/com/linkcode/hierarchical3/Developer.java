package com.linkcode.hierarchical3;

public class Developer extends Employee {
	
	String dName;
	int did;
	String droll;
	

	public Developer(String name, int id, int conNo,String dName,int did,String roll) {
		super(name, id, conNo);
		this.dName=name;
		this.did=did;
		this.droll=roll;
	}
}
