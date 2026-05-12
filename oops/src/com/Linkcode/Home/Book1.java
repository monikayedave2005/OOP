package com.Linkcode.Home;

public class Book1 {
	String bookName;
	String authorName;
	int pages;
	int price;

	public Book1(String bookName, String authorName, int pages, int price) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.pages = pages;
		this.price = price;
	}

		  
		

		public void displayInfo(){
			System.out.println("*=====BOOK MANAGEMENET SYSTEM=====*");
			System.out.println("Book Name : "+bookName);
			System.out.println("Author Name : "+authorName);
			System.out.println("No of pages : "+pages);
			System.out.println("Price : "+price);
			
		}
		public void read() {
			System.out.println("Reading");
		}
		}


	
 
