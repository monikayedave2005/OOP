package com.linkcode.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadByteToFile {
public static void main(String[] args) throws IOException {
	File file=new File("Operation.txt");
	if(file.exists()) {
		System.out.println("file present");
		FileInputStream inputStream=new FileInputStream(file);
		System.out.println(inputStream.read());
		System.out.println("data written");
		inputStream.close();
	}else {
		file.createNewFile();
			System.out.println("file created");
		
	}
}
}
