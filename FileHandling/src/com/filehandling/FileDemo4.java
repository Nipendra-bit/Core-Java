package com.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//write data to the file using char oriented stream.

public class FileDemo4 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));//it create file naming this if not exist in the system
            bw.write("BufferedWriter is more efficient for large text.");
            bw.newLine();
            bw.write("This is the second line.");
            bw.close(); //necessary to close.
            System.out.println("Data written with BufferedWriter.");
            System.out.println("Data reading through BufferedReader.");
            BufferedReader br=new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
