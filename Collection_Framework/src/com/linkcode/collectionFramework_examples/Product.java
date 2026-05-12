package com.linkcode.collectionFramework_examples;

public class Product {
	
	private int id;
	private String pname;
	private double price;
	private int qn;
	
	
	public Product(int id, String pname, double price, int qn) {
		super();
		this.id = id;
		this.pname = pname;
		this.price = price;
		this.qn = qn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQn() {
		return qn;
	}
	public void setQn(int qn) {
		this.qn = qn;
	}
	public void remove(Product products) {
		products.remove(products);
	}
}
