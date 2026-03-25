package com.linkcode.encapsulation;

public class Customer {
 private int accNo;
 String name;
 long mobile;
 String addr;
 private double bankBalance;
 private String pass;
 
 public String getPass() {
	 return this.pass;
 }
 
 public double getBankBalance() {  //getter for bankbalance
	 return this.bankBalance;
 }
 public void setBankBalance(int amount) {
	 this.bankBalance+=amount;
 }
 public int getAccNo() {
	 return this.accNo;
 }
 public void setAccNo(int no) {
	 this.accNo=no;
 }

 
public Customer(int accNo, String name, long mobile, String addr, double bankBalance,String pass) {
	
	this.accNo = accNo;
	this.name = name;
	this.mobile = mobile;
	this.addr = addr;
	this.bankBalance = bankBalance;
	this.pass=pass;
}
public void displayInfo() {
	 System.out.println("Account No : "+accNo);
	 System.out.println("Holder Name : "+name);
	 System.out.println("Mobile No : "+mobile);
	 System.out.println("Address : "+addr);
	 System.out.println("Bank Balance : "+bankBalance);
 }

public void withdraw(double amount) {
	System.out.println("withdrawing amount....");
	this.bankBalance-=amount;
	System.out.println("Available balance : "+this.bankBalance);
}

public void deposit(double amount) {
	// TODO Auto-generated method stub
	System.out.println("Amount deposited....");
	this.bankBalance+=amount;
	System.out.println("Total balance : "+this.bankBalance);
}
}
