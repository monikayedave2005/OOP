package com.Linkcode.Home;
import java.util.Scanner;
public class Book1Main {
	static Scanner sc=new Scanner(System.in);
	static Book1 books[]=new Book1[50];
	static int count;
	
	static {
		books[count++]=new Book1("harry","PQR",100,300);
		books[count++]=new Book1("art of war","ABC",500,200);
		books[count++]=new Book1("ikigai","PQR",700,400);
	}
public static void main(String[] args) {
	boolean flag=true;
	while(flag) {
		System.out.println("$$$ Book Management $$$");
		System.out.println("1.Add Book");
		System.out.println("2.Find book by name");
		System.out.println("3.Update book details");
		System.out.println("4.Display all books");
		System.out.println("5.Delete book");
		System.out.println("6.Exit");
		System.out.println("Enter your choice : ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1->addBook();
		case 2->FindBookByName();
		case 3->update();
		case 4->display();
		case 5->deleteBook();
//		case 6->
		}
	}
	
}
private static void deleteBook() {
	System.out.println("Enter book name to delete : ");
	String str1=sc.next();
	boolean flag=true;
	for(int i=0;i<count;i++) {
		if(books[i].bookName.equalsIgnoreCase(str1)) {
			books[i]=books[count-1];
			books[count-1]=null;
			count--;
			System.out.println("Book deleted successfully");
			flag=false;
			return;
		}
		if(!flag) {
			System.out.println("Book not found");
		}

	}
	
}
private static void update() {
	System.out.println("Enter book name to update : ");
	String str=sc.next();
	boolean found=true;
	
	for(int i=0;i<count;i++) {
		if(books[i].bookName.equalsIgnoreCase(str)) {
			found=true;
			System.out.println("Book found !! Enter new details");
			 
			 System.out.println("Enter new book name");
			 String str2=sc.next();
			 
			 System.out.println("Enter new book author: ");
			 String str3=sc.next();
			 
			 System.out.println("Enter new book page no :");
			 int n=sc.nextInt();
			 
			 System.out.println("Enter new book price : ");
			 int n1=sc.nextInt();
			 System.out.println("Book details updated successfully");
			 
			}
		if(!found) {
			System.out.println("Book not found");
		}
		}
	
	
}
private static void FindBookByName() {
	System.out.println("Enter book name : ");
	String name=sc.next();
	boolean flag=true;
	for(int i=0;i<count;i++) {
		if(books[i].bookName.equalsIgnoreCase(name)) {
			flag=false;
		System.out.println("===============");
		System.out.println("Book found successfully");
		books[i].displayInfo();
		System.out.println("===============");
		}
	}
	if(flag) {
		System.out.println("Book not found");
	}
}


private static void display() {
	System.out.println("Book details");
	System.out.println("================");
	for(int i=0;i<count;i++) {
		books[i].displayInfo();
	System.out.println("================");
	}
}
private static void addBook() {
	System.out.println("Enter book name : ");
	String name=sc.next();
	System.out.println("Enter book author :");
	String author=sc.next();
	System.out.println("Enter no of pages : ");
	int pages=sc.nextInt();
	System.out.println("Enter book price : ");
	int price=sc.nextInt();
	books[count++]=new Book1(name,author,pages,price);
	System.out.println("Books added successfully");
}
}

