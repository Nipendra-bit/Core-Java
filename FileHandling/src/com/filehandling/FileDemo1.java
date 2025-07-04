package com.filehandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

//This code represent how we can read a file doesn't matter text file or what.
//1st way can read any input stream or we can say any type of file but 2nd only read text file

public class FileDemo1 {

	public static void main(String[] args)throws IOException {
		
		//1st way to read a text file and efficient one too
		FileInputStream f=new FileInputStream("A.txt"); //here 1 point to notice that if the A.txt file not found then we can provide the total path of the text file also just like I do in next part 
		InputStreamReader s=new InputStreamReader(f);
		BufferedReader br=new BufferedReader(s);
		System.out.println(br.readLine());
		
		System.out.println();
		
		//2nd way to read a text file but less efficient 
		FileReader r=new FileReader("C:\\Users\\Nipendra Raghav\\OneDrive\\Desktop\\HTML1\\B.txt"); //just like this
		BufferedReader b=new BufferedReader(r);
		System.out.println(b.readLine());
	}

}
