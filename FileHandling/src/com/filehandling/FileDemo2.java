package com.filehandling;

import java.io.ByteArrayInputStream;
import java.io.IOException;

//byte reading through byte stream using loop

public class FileDemo2{
    public static void main(String[] args) throws IOException {
        byte[] b = {1, 2, 3, 4, 65};
        ByteArrayInputStream ba = new ByteArrayInputStream(b);

        int data;
        while ((data = ba.read()) != -1) {
            System.out.println(data);
        }
    }
}

