package com.linkcode.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainServices {
	static Scanner sc=new Scanner(System.in);
	static VehicleInventory inventory=new VehicleInventory();
	static boolean flag=true;
	
	public static void main(String[] args) {
		initializeVehicles();
		boolean flag=true;
		while(flag) {	
		
		System.out.println("-----Vehicle Rental System-----");
		System.out.println("1.Admin");
		System.out.println("2.Customer");
		System.out.println("Enter your choice : ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1->showAdminMenu();
		case 2->showCustomerMenu();
		default->System.out.println("Invalid choice");
		}
}
	}

	public static void initializeVehicles() {
		inventory.addVehicle(new Car("C100",4000,7));
		inventory.addVehicle(new Car("C200",3000,5));
		inventory.addVehicle(new Bike("B100",7000,true));
		inventory.addVehicle(new Bike("B100",8000,false));
		inventory.addVehicle(new Bus("b200",2000,70));
		inventory.addVehicle(new Bus("b400",1000,40));
	}

	private static  void showAdminMenu() {
		System.out.println("Enter username : ");
		String username=sc.next();
		System.out.println("Enter Password : ");
		String pass=sc.next();
	
	if(Admin.authenticate(username,pass)) {
		boolean adminflag=true;
		while(adminflag=true) {
			
		System.out.println("----Menu-----");
		System.out.println("1.Add vehicle");
		System.out.println("2.Remove vehicle");
		System.out.println("3.Send vehicle for maintenance");
		System.out.println("4.Complete vehicle maintenance");
		System.out.println("5.Show all vehicle info");
		System.out.println("6.Exit");
		System.out.println("Enter your choice : ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1-> {
			System.out.println("Select Vehicle to add...");
			System.out.println("Car");
			System.out.println("Bus");
			System.out.println("Bike");
			System.out.println("Enter your choice : ");
			int choice=sc.nextInt();
			System.out.println("Enter vehicle ID : ");
			String id=sc.next();
			System.out.println("Enter rental rate : ");
			double rate=sc.nextDouble();
			switch(choice) {
			case 1->{
				System.out.println("Enter no of seats : ");
				int no=sc.nextInt();
				Car car=new Car(id,rate,no);
				inventory.addVehicle(car);
				System.out.println("Car added successfully !!!");
				
			}
			case 2->{
				System.out.println("Enter no of seats : ");
				int no=sc.nextInt();
				Bus bus=new Bus(id,rate,no);
				inventory.addVehicle(bus);
				System.out.println("Bus added successfully !!!");
			}
			case 3->{
				System.out.println("helmet available ?(yes/no)");
				String ha=sc.next();
				boolean hat=ha.equalsIgnoreCase("yes");
				inventory.addVehicle(new Bike(id,rate,hat));
				System.out.println("Bike added successfully !!!");
			}
			default->System.out.println("Invalid choice");
			}
			
		}
		case 2->{
			System.out.println("Enter vehicle ID : ");
			String id=sc.next();
			Vehicle vehicle=findVehicleByID(id);
			if(vehicle!=null) {
				System.out.println("Vehicle found");
				inventory.removeVehicle(vehicle);
			}else {
				System.out.println("Vehicle not found");
			}
		}
		case 3->{
			System.out.println("Enter vehicle ID : ");
			String id=sc.next();
			Vehicle vehicle=findVehicleByID(id);
			vehicle.sendForMaintenance();
			System.out.println("Vehicle ready for maintenance");
			
		}
		case 4->{
			System.out.println("Enter vehicle ID : ");
			String id=sc.next();
			Vehicle vehicle=findVehicleByID(id);
			vehicle.completeMaintenance();
			System.out.println(" maintenance is complete ");
			
		}
		case 5->{
			ArrayList<Vehicle> vehicles=inventory.getAllVehicles();
			System.out.println("------Vehicle List----------");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("|   Vehicle id  |     Rental Rate       |     Available       |");
			System.out.println("-----------------------------------------------------------------");

			for(Vehicle veh:vehicles) {
				System.out.println("|\t"+veh.getVehicleId()+"\t|\t "+veh.getRentalRate()+" \t|\t"+(veh.isAvailable()+"\t\t|\t"));
			}
			
		}
		case 6->adminflag=false;
		}
		}
	}else {
		System.out.println("Invalid username or password");
	}
	
}
private static Vehicle findVehicleByID(String id) {
	List<Vehicle> vehicles=inventory.getAllVehicles();
	for(Vehicle veh:vehicles) {
		if(veh.getVehicleId().equals (id)) {
			return veh;
		}
	}
	return null;
	
		
	}

private static void showCustomerMenu() {
		boolean f=true;
	
		System.out.println("---------------Form-------------");
		System.out.println("Enter your name : ");
		String name=sc.next();
		sc.nextLine();
		System.out.println("Enter your email : ");
		String email=sc.nextLine();
		System.out.println("Enter your mobile : ");
		long mobile=sc.nextLong();
		System.out.println("License availale : (yes/no)");
		String la=sc.next();
		boolean ls=la.equalsIgnoreCase("yes");
		
		Customer customer=new Customer(name,email,mobile,ls);
		while(f) {
			System.out.println("---------Customer Menu--------- ");
		System.out.println("1.Show available cars ");
		System.out.println("2.Show available bikes");
		System.out.println("3.Show available bus");
		System.out.println("4.Rent a vehicle");
		System.out.println("5.Return rented vehicle");
		System.out.println("6.view rented vehicle");
		System.out.println("7.Exit");
		System.out.println("Enter your choice : ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1->inventory.showAvailableVehicles(Car.class);
		case 2->inventory.showAvailableVehicles(Bike.class);
		case 3->inventory.showAvailableVehicles(Bus.class);
		case 4->{
			System.out.println("Enter vehicle id : ");
			String id=sc.next();
			System.out.println("Enter no of days : ");
			int no=sc.nextInt();
			Vehicle vehicle=findVehicleByID(id);
			customer.rentVeicle(vehicle,no);
			
		}
		case 5->{
			System.out.println("Enter vehicle ID to return : ");
			String id=sc.next();
			Vehicle vehicle=findVehicleByID(id);
			if(vehicle!=null) {
				customer.returnVehicle(vehicle);
			}
			
		}
		case 6->{
			customer.viewRentedVehicle();
		}
		case 7->f=false;
		default->System.out.println("Invalid choice");
		}
		}
		
		
	}
}
