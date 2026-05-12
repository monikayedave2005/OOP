package com.linkcode.studentDetails;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Student> students=new ArrayList<>();
public static void main(String[] args) throws IOException {
	System.out.println("---WELCOME TO STUDENT MANAGEMENT SYSTEM---");
	System.out.println("1.Add Students");
	addStudent();
	displayStudents();
}

private static void displayStudents() {
	System.out.println("----Student Details----");
	for(Student s:students) {
		s.display();
	}
	
}

private static void addStudent() throws IOException {
	System.out.println("Enter student Roll no: ");
	int no=sc.nextInt();
	System.out.println("Enter student Name : ");
	String name=sc.next();
	System.out.println("Enter student Marks : ");
	double mark=sc.nextDouble();
	System.out.println("Enter student Grade : ");
	char grade = sc.next().charAt(0);
	Student s = new Student(no, name, mark, grade);
	students.add(s);
	File file=new File("StudentInfo.txt");
	if(!file.exists()) {
		file.createNewFile();
		System.out.println("file created");
		}
	FileWriter writer=new FileWriter(file);
	writer.write("----Student Data----\n");
    writer.write("----------------------\n");
	writer.write("Roll No : " + s.getRollNo() + "\n");
    writer.write("Name : " + s.getName() + "\n");
    writer.write("Marks : " + s.getMarks() + "\n");
    writer.write("Grade : " + s.getGrade() + "\n");
    writer.write("----------------------\n");
    writer.close();
    System.out.println("Student data added into file");
 
}
}
