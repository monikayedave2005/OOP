package com.linkcode.Vehicle;

import java.time.LocalDate;

public class EmailService {
public static void sendBookingConfirmation() {
	System.out.println("Mail sending....");
}

public static String sendBookingConfirmation(Customer cust, Vehicle vehicle, double amount) {
	String sub="Vehicle rental confirmation";
	String data="Respected "+cust.getName()+",\n"+
				"Vehicle ID : "+vehicle.getVehicleId()+",\n"+
				"Rental Rate : "+vehicle.getRentalRate()+",\n"+
				"Total Bill : "+amount+",\n"+
				"Paid amount : "+amount+",\n"+
				"No of Days : "+vehicle.getRentedDays()+",\n"+
				"Day start from : "+LocalDate.now()+" to " +LocalDate.now().plusDays(vehicle.getRentedDays())+".\n"+
				"Thank you !!!  Visit Again !!!";
	
	System.out.println("Sending mail to "+cust.getEmail());
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Mail sent successfully!");
	return data;
	
}
}
