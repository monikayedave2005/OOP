package com.Linkcode.Home;

import java.util.Scanner;

public class BookMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("*********Book Management**********");
	
	
	System.out.println("How many book details you want to add : ");
	int n=sc.nextInt();
	
	Book arr[]=new Book[n];
	for(int i=0;i<n;i++) {
		System.out.println("Enter book details for book no. : "+(i+1));
		System.out.println("Enter Book name : ");
		String name=sc.next();
		System.out.println("Enter author name : ");
		String author=sc.next();
		System.out.println("Enter no of pages : ");
		int page=sc.nextInt();
		System.out.println("Enter price : ");
		int price=sc.nextInt();
		arr[i]=new Book(name,author,page,price);
	}
	System.out.println("Books added Successfully...");
	System.out.println("========Book details=========");
	for(int i=0;i<n;i++) {
		System.out.println("Book name   : "+arr[i].bookName);
		System.out.println("Author name : "+arr[i].authorName);
		System.out.println("Book pages  : "+arr[i].pages);
		System.out.println("Book Price  : "+arr[i].price);
		System.out.println("=============================");
		
	}
	
	
}
}
