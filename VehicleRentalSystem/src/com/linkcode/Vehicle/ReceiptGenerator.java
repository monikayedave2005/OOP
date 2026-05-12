package com.linkcode.Vehicle;

public class ReceiptGenerator {

	public static void generateReceipt(String msg) {
		System.out.println("Generating Receipt........");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(msg);
		
	}
	
}
