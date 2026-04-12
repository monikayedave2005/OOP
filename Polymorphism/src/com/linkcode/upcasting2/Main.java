package com.linkcode.upcasting2;

public class Main {
public static void main(String[] args) {
	//upcasting
//	Teacher teacher=new Teacher();
//	teacher.TeacherInfo();
//	teacher.HODInfo();
//	teacher.PrincipleInfo();
//	HOD hod=teacher;
//	hod.HODInfo();
//	hod.PrincipleInfo();
//	Principle prin=hod;
//	prin.PrincipleInfo();
	
	//downcasting
	
	Principle prin=new Teacher();
	prin.PrincipleInfo();
	HOD hod=(HOD)prin;
	hod.HODInfo();
	hod.PrincipleInfo();
	Teacher teacher=(Teacher)hod;
	teacher.HODInfo();
	teacher.PrincipleInfo();
	teacher.TeacherInfo();
	
	
	
}
}
