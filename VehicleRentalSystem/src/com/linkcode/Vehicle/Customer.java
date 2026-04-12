package com.linkcode.Vehicle;

import java.util.ArrayList;

public class Customer {
	private String name;
	private long mobile;
	private String email;
	private boolean isLicenseAvailable;
	private ArrayList <Vehicle> rentedVehicles;
	
	
	public Customer(String name, String email, long mobile, boolean la) {
		
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.isLicenseAvailable = la;
		this.rentedVehicles = new ArrayList<Vehicle>();
	}
	
	public void rentVeicle(Vehicle veh,int no) {
		if(veh.isAvailable()) {
			if(veh.rent(this,no)){
				System.out.println("Process complete");
				this.rentedVehicles.add(veh);
			}else {
				System.out.println("Process incomplete");
			}
			
		}else {
			System.out.println("Vehicle not present");
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isLicenseAvailable() {
		return isLicenseAvailable;
	}

	public void setLicenseAvailable(boolean isLicenseAvailable) {
		this.isLicenseAvailable = isLicenseAvailable;
	}

	public ArrayList getRentedVehicles() {
		return rentedVehicles;
	}

	public void setRentedVehicles(ArrayList rentedVehicles) {
		this.rentedVehicles = rentedVehicles;
	}

	public void returnVehicle(Vehicle vehicle) {
		if(!vehicle.isAvailable()) {
			vehicle.returnVehicle();
			rentedVehicles.remove(vehicle);
		}
	}
	public void viewRentedVehicle() {
		System.out.println("\t\tCustomer Name\t : \t"+this.name);
		System.out.println("--------Rented Vehicle List--------");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("|   Vehicle id  |     Rental Rate       |     Available       |    Rented Days   |");
		System.out.println("-----------------------------------------------------------------------------------");
		for(Vehicle veh:rentedVehicles) {
			System.out.println("|\t"+veh.getVehicleId()+"\t|\t "+veh.getRentalRate()+" \t|\t"+veh.isAvailable()+"\t\t|\t"+veh.getRentedDays()+"\t|");
		}
		
	}
}
