package com.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileClassDemo1 {
    public static void main(String[] args)throws IOException {
        File myFile = new File("example.txt"); //here myFile is an object that refer to that file

        if (myFile.exists()) {
            System.out.println("File already exists.");
        } else {
            try {
                if (myFile.createNewFile()) {
                    System.out.println("File created: " + myFile.getName());
                } else {
                    System.out.println("File could not be created.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        
        BufferedWriter bw=new BufferedWriter(new FileWriter("example.txt"));
        bw.write("Hello Garima How are you?");
        System.out.println("Message is written in the file");
        bw.close();
    }
}
