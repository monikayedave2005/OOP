package com.linkcode.studentDetail2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.linkcode.studentDetails.Student;

public class StudentManagement {
	static File file=new File("StudentManagement1.txt");
	static ArrayList<Student> students=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) throws IOException {
	boolean flag=true;
	while(flag){
		System.out.println("---Student Management System---");
		System.out.println("1.Add Student");
		System.out.println("2.Display All Student");
		System.out.println("3.Find student by rollno");
		System.out.println("4.Update student details");
		System.out.println("5.Delete Student");
		System.out.println("6.Exit");
		System.out.println("Enter your choice : ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1->{
			addStudent();
		}
		case 2-> {
			displayStudent();
		}
		case 3->{
			System.out.println("Enter student roll no : ");
			String roll=sc.next();
			findStudentByRoll(roll);
		}
		case 4->{
			
		}
		case 5->{
			System.out.println("Enter rol no : ");
			String roll=sc.next();
			deleteStudent(roll);
		}
		//case 6->flag=false;
		
		
		}
	}
	
}
private static void deleteStudent(String roll) throws IOException {
	if(file.exists()) {
        FileReader reader = new FileReader(file);
        Scanner sc1 = new Scanner(reader);
        String filedata="";
        
        while(sc1.hasNextLine()) {
            String line = sc1.nextLine();
            String arr[] = line.split("\\|\\|");

            if(arr[0].equals(roll)) {
                
                continue; 
            }
            filedata+=(line+"\n");
           
        }
        FileWriter writer = new FileWriter(file);
        writer.write(filedata);
        reader.close();
        sc1.close();
        writer.close();
        System.out.println("student deleted successfully");

	} else {
        System.out.println("File does not exist");
    }
}

private static void findStudentByRoll(String roll) throws IOException {
	if(file.exists()) {
		FileReader reader=new FileReader(file);
		Scanner sc= new Scanner(reader);
		boolean flag=true;
		while(sc.hasNextLine()) {
			String line=sc.nextLine();
			String arr[]=line.split("\\|\\|");
			if (arr[0].equals(roll)) {
				flag=false;
				System.out.println("student record found");
				System.out.println(line);
				return;
			}
		}
		System.out.println("Student record not found");
		sc.close();
		reader.close();
	}else {
		System.out.println("File does not exist");
	}
	
}
private static void displayStudent() {
	System.out.println("$*$--Student Details--$*$1");
	for(Student s:students) {
		s.display();
	}
	
}
private static void addStudent() throws IOException {
	FileWriter writer=new FileWriter(file,true);
	System.out.println("Enter student roll no : ");
	int roll=sc.nextInt();
	System.out.println("Enter student name : ");
	String name=sc.next();
	System.out.println("Enter student marks : ");
	double marks=sc.nextDouble();
	System.out.println("Enter student grade : ");
	char grade=sc.next().charAt(0);
	Student s = new Student(roll, name, marks, grade);
	students.add(s);
	File file=new File("StudentManagement1.txt");
	if(!file.exists()) {
		file.createNewFile();
		System.out.println("file created");
		}
	FileWriter writer1=new FileWriter(file);
	writer1.write("----Student Data----\n");
    writer1.write("----------------------\n");
	writer1.write("Roll No : " + s.getRollNo() + "\n");
    writer1.write("Name : " + s.getName() + "\n");
    writer1.write("Marks : " + s.getMarks() + "\n");
    writer1.write("Grade : " + s.getGrade() + "\n");
    writer1.write("----------------------\n");
    System.out.println("Student data added into file");
	
	writer1.write(roll+"||"+name+"||"+marks+"||"+grade+"\n");
	System.out.println("Student added successfully");
	writer1.close();
}
}
