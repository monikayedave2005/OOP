package com.linkcode.Vehicle;

public class Vehicle {
	private String vehicleId;
	private double rentalRate;
	private boolean isAvailable;
	private int rentedDays;
	private boolean underMaintenance;
	
	Vehicle(String id,double rate){
		this.vehicleId=id;
		this.rentalRate=rate;
		this.isAvailable=true;
		this.underMaintenance=false;
		this.rentedDays=0;
	}
	
	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getRentedDays() {
		return rentedDays;
	}

	public void setRentedDays(int rentedDays) {
		this.rentedDays = rentedDays;
	}

	public boolean isUnderMaintenance() {
		return underMaintenance;
	}

	public void setUnderMaintenance(boolean underMaintenance) {
		this.underMaintenance = underMaintenance;
	}

	public boolean rent(Customer cust, int no) {
		if(this.isAvailable) {
			double amount=rentalRate*no;
			System.out.println("Amount to pay : "+amount);
			if(PaymentGateway.processPyment(amount)) {
				this.isAvailable=false;
				this.rentedDays=no;
				String msg=EmailService.sendBookingConfirmation(cust,this,amount);
				ReceiptGenerator.generateReceipt(msg);
				
				return true;
				
			}
		}
	
		return false;
	}
	public void returnVehicle() {
		this.isAvailable=true;
		this.rentedDays=0;
	}
	public void sendForMaintenance() {
		if(this.isAvailable) {
			this.underMaintenance=true;
			this.isAvailable=false;

		}
	}
	public void completeMaintenance() {
		if(this.underMaintenance) {
			this.isAvailable=true;
			this.underMaintenance=false;
			      
		}
	}
	
}