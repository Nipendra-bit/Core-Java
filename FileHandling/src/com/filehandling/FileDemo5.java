package com.filehandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//write data through byte oriented stream 

public class FileDemo5 {

	public static void main(String[] args) throws IOException{
	
		FileOutputStream f=new FileOutputStream("output1.bin");
		String text="Hello change it in bytes";
		f.write(text.getBytes());
		System.out.println("Data is written in the file");
		
		System.out.println("Data is reading from the file");
		FileInputStream f1=new FileInputStream("output1.bin");
		InputStreamReader s=new InputStreamReader(f1);
		BufferedReader br=new BufferedReader(s);
		System.out.println(br.readLine());
		
		f.close();
	}

}
