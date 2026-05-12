package com.linkcode.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadCharToFile {
public static void main(String[] args) throws IOException {
	File file=new File("Operations.txt");
	if(file.exists()) {
		System.out.println("Data from file : ");
		FileReader reader=new FileReader(file);
		Scanner sc=new Scanner(reader);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
		reader.close();
	}else {
		System.out.println("File does not exist");
	}
}
}
