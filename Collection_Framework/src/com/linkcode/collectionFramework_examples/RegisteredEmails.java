package com.linkcode.collectionFramework_examples;

import java.util.HashSet;
import java.util.Scanner;

public class RegisteredEmails {
	// HashSet example
	static HashSet<String> emails=new HashSet<String>();
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	boolean flag=true;
	while(flag) {
	System.out.println("----Login System----");
	System.out.println("1.create new account");
	System.out.println("2.Login");
	System.out.println("3.Exit");
	System.out.println("--------------------");
	System.out.println("Enter your choice : ");
	int ch=sc.nextInt();
	System.out.println("Enter email : ");
	String email=sc.next();
	switch(ch) {
	case 1-> Registration(email);
	case 2-> Login(email);
	case 3-> flag=false;
	}
	}
	
}
private static void Login(String email) {
	if(emails.contains(email)) {
		System.out.println("User verified");
	}
	else {
		System.out.println("User not verified");
	}
}
private static void Registration(String email) {
	boolean isadded=emails.add(email);
	if(isadded) {
		System.out.println("Account created ...");
	}
	else {
		System.out.println("user already exist... please register");
	}
}
}
