package com.linkcode.hierarchical2;

public class Main {
	public static void main(String[] args) {
		Son son=new Son("Roshan",40,"Pune",987653536,"Rahul",21,"Sane Guruji",987643663);
		Daughter daughter=new Daughter("Rani",36,"Pune",875534574,"Resha",20,"Sane Guruji",769857588);
		System.out.println();
		System.out.println("------SON INFORMATION------");
		System.out.println();
		System.out.println("Parent Name     : "+son.pName);
		System.out.println("Parent age      : "+son.pAge);
		System.out.println("Parent Address  : "+son.pAddr);
		System.out.println("Parent Contact  : "+son.conNo);
		System.out.println("Son name        : "+son.sName);
		System.out.println("Son Age         : "+son.sAge);
		System.out.println("Son School name : "+son.sSchool);
		System.out.println("Son Contact no  : "+son.contNo);
		System.out.println();
		System.out.println("------DAUGHTER INFORMATION------");
		System.out.println();
		System.out.println("Parent Name          : "+daughter.pName);
		System.out.println("Parent age           : "+daughter.pAge);
		System.out.println("Parent Address       : "+daughter.pAddr);
		System.out.println("Parent Contact       : "+daughter.conNo);
		System.out.println("Daughter name        : "+daughter.dName);
		System.out.println("Daughter Age         : "+daughter.dAge);
		System.out.println("Dauhter School name  : "+daughter.dSchool);
		System.out.println("Daughter Contact no  : "+daughter.cont1No);
		
	}
}

