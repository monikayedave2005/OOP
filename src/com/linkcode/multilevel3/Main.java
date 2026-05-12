package com.linkcode.multilevel3;

	public class Main {

	    public static void main(String[] args) {

	        NewTeacher teacher = new NewTeacher(
	                "Rekha", "Maths", 98738473,
	                "P1", 984798849, "Female",
	                "HOD1", 101, "Comp"
	        );

	        System.out.println("Teacher name : " + teacher.gettName());
	        System.out.println("Subject name : " + teacher.getSubname());
	        System.out.println("Teacher contact no : " + teacher.getTconNo());

	        System.out.println("Principal name : " + teacher.getName());
	        System.out.println("Principal contact no : " + teacher.getPno());
	        System.out.println("Principal gender : " + teacher.getGender());

	        System.out.println("HOD name : " + teacher.gethName());
	        System.out.println("HOD id : " + teacher.getHid());
	        System.out.println("HOD Branch : " + teacher.getBranch());
	    }
	}

