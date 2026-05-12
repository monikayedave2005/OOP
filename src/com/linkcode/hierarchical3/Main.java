package com.linkcode.hierarchical3;

public class Main {
public static void main(String[] args) {
	Developer dev=new Developer("ABC",100,9282763,"Dev1",101,"Developing");
	Tester test=new Tester("XYZ",200,8967567,"Test1",201,"Testing");
	System.out.println();
	System.out.println("------Developer DATA------");
	System.out.println();
	System.out.println("Emp Name    : "+dev.eName);
	System.out.println("Emp ID      : "+dev.eid);
	System.out.println("Emp Contact : "+dev.conNo);
	System.out.println("Dev Name    : "+dev.eName);
	System.out.println("Dev Id      : "+dev.did);
	System.out.println("Dev Roll    : "+dev.droll);
	System.out.println();
	
	System.out.println("-------TESTER DATA---------");
	System.out.println();
	System.out.println("Emp Name    : "+test.eName);
	System.out.println("Emp ID      : "+test.eid);
	System.out.println("Emp Contact : "+test.conNo);
	System.out.println("Dev Name    : "+test.eName);
	System.out.println("Dev Id      : "+test.tid);
	System.out.println("Dev Roll    : "+test.troll);
	System.out.println();
}
}
