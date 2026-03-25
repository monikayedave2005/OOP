package com.linkcode.encapsulation;

import java.util.Scanner;

public class Bank {
	static Scanner sc=new Scanner(System.in);
	static Customer cust1;
public static void main(String[] args) {
	boolean flag=true;
	while(flag) {
	System.out.println("----WELCOME TO SBI---");
	System.out.println("1.Create new account");
	System.out.println("2.Check balance");
	System.out.println("3.Withdraw money");
	System.out.println("4.Deposit money");
	System.out.println("5.Exit");
	System.out.println("Enter your choice : ");
	int ch=sc.nextInt();
	switch(ch) {
	case 1->{
		System.out.println("Enter your name : ");
		String name=sc.next();
		System.out.println("Enter your mobile no : ");
		long mobile=sc.nextLong();
		System.out.println("Enter your address : ");
		String addr=sc.next();
		System.out.println("Enter your Bank balance");
		double bankBalance=sc.nextDouble();
		System.out.println("Generating account no.... ");
		int accNo=((int)Math.random()*1000);
		System.out.println("Account no : "+accNo);
		
		System.out.println("Enter password : ");
		String pass=sc.next();
	    
	    
		cust1=new Customer(accNo,name,mobile,addr,bankBalance,pass);
		System.out.println("Account created successfully");
		cust1.displayInfo();
		
	}
	case 2->{
		System.out.println("Available balance : "+cust1.getBankBalance()); 
	}
	case 3->{
		System.out.println("Enter account no : ");
		int acc=sc.nextInt();
		System.out.println("Enter password : ");
		String pass=sc.next();
		if(acc==cust1.getAccNo() && pass.equals(cust1.getPass())) {
		System.out.println("Enter amount to withdraw : ");
		double amount=sc.nextDouble();
		if(cust1.getBankBalance()>amount) {
			cust1.withdraw(amount);
		}
		else {
			System.out.println("Low bank balance");
		}
		}
		
		else {
			System.out.println("user not found OR invalid password");
		}
	}
	
	case 4->{
		System.out.println("Enter account no : ");
		int acc=sc.nextInt();
		System.out.println("Enter password : ");
		String pass=sc.next();
		System.out.println("Enter Amount to deposit : ");
		double amount=sc.nextDouble();
		cust1.deposit(amount);
	}
	case 5->{
		flag=false;
		System.out.println("Exit!!! Thank you");
	}
	}
	}
}
}
