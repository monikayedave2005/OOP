package com.linkcode.override2;

public class EmployeeMain {
public static void main(String[] args) {
	//toString is object class method
	Employee emp=new Employee(101,"Suraj",40000,"Hadapsar");
	
//	Object obj=emp;
//	System.out.println(obj);
	Employee emp1=new Employee(102,"Suraj",45000,"JM road");
    emp.displayInfo();
    emp1.displayInfo();
    System.out.println();
    System.out.println("toString method");
    System.out.println(emp.toString());
	System.out.println(emp1.toString());
	System.out.println();
	System.out.println("Equals method");
	System.out.println(emp.equals(emp1));
	System.out.println();
	System.out.println("Hashcode");
	System.out.println(emp1.hashCode());
}
}
