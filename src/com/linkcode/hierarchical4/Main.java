package com.linkcode.hierarchical4;

public class Main {
	public static void main(String[] args) {
		Wipro wipro=new Wipro("WIPRO",7000,"Data analysis","Harry",800000.0,5000000.0);
		Infosys info=new Infosys("INFOSYS",9000,"Testing","Rahul",600,600000);
		wipro.empInfo();
		info.displayInfosys();
	}
}
