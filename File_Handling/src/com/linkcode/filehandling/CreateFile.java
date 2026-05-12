package com.linkcode.filehandling;

import java.io.File;

import java.io.IOException;

public class CreateFile {
	
public static void main(String[] args) throws IOException {
//	File file=new File("test5.pdf");
//	if (file.exists()) {
//		System.out.println("File already exist");
//		file.delete();
//		System.out.println("file deleted");
//	}else {
//		file.createNewFile();
//			System.out.println("File created succsessfully");
//		
//	}
			File file1 = new File("sample.txt");
	        File file2 = new File("document.pdf");
	        File file3 = new File("image.jpg");
	        File file4 = new File("music.mp3");
	        File file5 = new File("video.mp4");
	        File file6 = new File("program.java");
	        File file7 = new File("data.csv");
	        File file8 = new File("webpage.html");
	        File file9 = new File("style.css");
	        File file10 = new File("archive.zip");

	        File[] files = {
	                file1, file2, file3, file4, file5,
	                file6, file7, file8, file9, file10
	        };

	        for (File file : files) {

	            if (file.exists()) {

	                System.out.println(file.getName() + " already exists");

	                file.delete();

	                System.out.println(file.getName() + " deleted");

	            } else {

	                file.createNewFile();

	                System.out.println(file.getName() + " created successfully");
	            }

	            System.out.println("----------------------");
	        }
	    }
}

