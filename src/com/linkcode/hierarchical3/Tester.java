package com.linkcode.hierarchical3;

public class Tester extends Employee {
	String tName;
	int tid;
	String troll;
	

	public Tester(String name, int id, int conNo,String tName,int tid,String roll) {
		super(name, id, conNo);
		this.tName=tName;
		this.tid=tid;
		this.troll=roll;
	}
}
