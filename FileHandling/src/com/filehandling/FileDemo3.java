package com.filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//read value from keyboard
public class FileDemo3 {

	public static void main(String[] args)throws IOException {
		
		System.out.println("enter the value u want to read");
		BufferedInputStream bis=new BufferedInputStream(System.in);
		InputStreamReader isr=new InputStreamReader(bis);
		BufferedReader br=new BufferedReader(isr);
		System.out.println(br.readLine());

	}

}
