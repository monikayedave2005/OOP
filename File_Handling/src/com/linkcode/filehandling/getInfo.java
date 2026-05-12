package com.linkcode.filehandling;
import java.io.File;
import java.io.IOException;

public class getInfo 
{
public static void main(String[] args) throws IOException  
	{
	
	File file=new File("test.txt");
	if(!file.exists()) 
	{
		file.createNewFile();
		System.out.println("file created");
		
	}
	if(file.exists()) 
	{
		System.out.println("Name : "+file.getName());
		System.out.println("Location : "+file.getAbsolutePath());
		System.out.println("Size : "+file.length());
		System.out.println(file.getTotalSpace());
		
		if(file.canRead()) 
		{
			System.out.println("file is readable");
		}
		if(file.canWrite()) 
		{
			System.out.println("file is writable");
		}
		if(file.canExecute()) 
		{
			System.out.println("file is executable");
		}
	}
	else
	{
		System.out.println("file does not exits");
	}
}
}
