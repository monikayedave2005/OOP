package com.linkcode.Vehicle;

import java.util.ArrayList;

public class VehicleInventory {
	ArrayList <Vehicle> vehicles;  // generic type parameter used to store addr of veh
	
	public 	VehicleInventory() {
		this.vehicles=new ArrayList();
	}
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	public void remoteVehicle() {
		
	}
	public ArrayList getAllVehicles() {
		return vehicles;
	}
	public void showAvailableVehicles( Class<?> type) {
		System.out.println("--------"+type.getSimpleName()+" List--------");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("|   Vehicle id  |     Rental Rate       |     Available       |");
		System.out.println("-----------------------------------------------------------------");
		for(Vehicle veh:vehicles) {
			if(type.isInstance(veh)&&veh.isAvailable()) {
				System.out.println("|\t"+veh.getVehicleId()+"\t|\t "+veh.getRentalRate()+" \t|\t"+(veh.isAvailable()+"\t\t|\t"));
			}
		}
		System.out.println("------------------------------------------------------------------");
		
	}
	public void removeVehicle(Vehicle vehicle) {
		vehicles.remove(vehicle);
		System.out.println("Vehicle removed.!!!");
		
	}
	
}
