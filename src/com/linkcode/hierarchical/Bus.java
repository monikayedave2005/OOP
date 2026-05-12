package com.linkcode.hierarchical;

public class Bus extends Vehical{
	
		
		String cname;
		String power;
		double price;
		
		public Bus(int id,int capacity,String enginetype,String cname,String power,double price) {
		super(id,capacity,enginetype);
		this.cname=cname;
		this.power=power;
		this.engineType=enginetype;
			
		}

		
	}
	

