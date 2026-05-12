package com.linkcode.hierarchical;

public class Main {
public static void main(String[] args) {
	Car car=new Car(101,500,"inline","honda","black",4);
	
	Bus bus=new Bus(102,550,"inline4","skoda","1000HP",200000.0);
	
	System.out.println("----------CAR DETAILS----------");
	System.out.println("Vehicle Id    : "+car.vehicleid);
	System.out.println("Fuel capacity : "+car.fuelCapacity);
	System.out.println("Engine Type   : "+car.engineType);
	System.out.println("Company name  : "+car.cname);
	System.out.println("Color         : "+car.color);
	System.out.println("No of wheels  : "+car.noOfWheels);
	System.out.println();
	
	System.out.println("---------BUS DETAILS----------");
	System.out.println("Vehicle Id    : "+bus.vehicleid);
	System.out.println("Fuel capacity : "+bus.fuelCapacity);
	System.out.println("Engine Type   : "+bus.engineType);
	System.out.println("Company name  : "+bus.cname);
	System.out.println("Power         : "+bus.power);
	System.out.println("Price         : "+bus.price);
	
}
}
