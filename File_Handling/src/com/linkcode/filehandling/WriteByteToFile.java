package com.linkcode.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByteToFile {
public static void main(String[] args) throws IOException {
	File file=new File("OperationByte.txt");
	if(file.exists()) {
		System.out.println("file present");
		FileOutputStream output=new FileOutputStream(file);
		output.write(67);
		System.out.println("data written");
		output.close();
	}else {
		file.createNewFile();
			System.out.println("file created");
		
	}
}
}
