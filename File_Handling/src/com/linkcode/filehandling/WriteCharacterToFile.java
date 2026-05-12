package com.linkcode.filehandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteCharacterToFile {
	public static void main(String[] args) throws IOException {
		File file=new File("test.txt");
		if(file.exists()) {
			System.out.println("file present");
			FileWriter writer=new FileWriter(file,true);
			writer.write("\nfourth new data added");
			System.out.println("data written to file");
			writer.close();
		}else {
			System.out.println("file does not exist");
		}
	}
}
