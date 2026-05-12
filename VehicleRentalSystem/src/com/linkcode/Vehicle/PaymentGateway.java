package com.linkcode.Vehicle;
import java.util.Scanner;
public class PaymentGateway {
	static Scanner sc=new Scanner (System.in);
	public static boolean  processPyment(double amount) {
		System.out.println("Enter amount to pay : ");
		double am=sc.nextDouble();
		if(am>=amount) {
			System.out.println("Transaction complete  : "+am);
			return true;
		}else {
			System.out.println("Incomplete payment : ");
			System.out.println("Please pay remaining amount : "+(amount-am));
			return false;
		}
		
	}
}
