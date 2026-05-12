package com.linkcode.studentDetail2;

public class Student1 {
private int rollNo;
private String name;
private double marks;
private char grade;
public Student1(int rollNo, String name, double marks, char grade) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.marks = marks;
	this.grade = grade;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
public char getGrade() {
	return grade;
}
public void setGrade(char grade) {
	this.grade = grade;
}
public void display() {
	System.out.println("-------------------");
	System.out.println("Roll No : "+rollNo);
	System.out.println("Name : "+name);
	System.out.println("Marks : "+marks);
	System.out.println("Grade : "+grade);
	System.out.println("-------------------");

}


}
