package com.linkcode.inheritance;

public class A extends B {
	int a;
	 public void test() {
		System.out.println("Test method a");
	}
	 {
		 System.out.println("ns block a");
	 }
	 A(){
		 System.out.println(" constrc a");
	 }
	 public static void main(String[] args) {
		A a=new A();
		System.out.println("Main method");
		A b=new A();
	}
}
