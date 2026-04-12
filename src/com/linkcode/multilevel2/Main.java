package com.linkcode.multilevel2;

public class Main {
	public static void main(String[] args) {
		Teacher teacher=new Teacher("Rekha","Maths",98738473,"P1",984798849,"Female","HOD1",101,"Comp");
		System.out.println("Teacher name : "+teacher.tName);
		System.out.println("Subject name : "+teacher.subname);
		System.out.println("Teacher contact no : "+teacher.tconNo);
		System.out.println("Principal name : "+teacher.name);
		System.out.println("Principal contact no : "+teacher.pno);
		System.out.println("Principal gender : "+teacher.gender);
		System.out.println("Hod name : "+teacher.hName);
		System.out.println("HOD id : "+teacher.hid);
		System.out.println("HOD Branch : "+teacher.branch);
	}
}
