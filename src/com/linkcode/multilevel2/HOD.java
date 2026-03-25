package com.linkcode.multilevel2;

public class HOD extends Principal{
	String hName;
	int hid;
	String branch;
	 public HOD(String name,int no,String gender,String hname1,int id,String branch) {
		 super(name,no,gender);
		 this.hName=hname1;
		 this.hid=id;
		 this.branch=branch;
	 }
}
