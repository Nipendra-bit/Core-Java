package com.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args)throws IOException,ClassNotFoundException {
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("exam.ser"));
		Employee e1=(Employee)ois.readObject();
		Employee e2=(Employee)ois.readObject();
		System.out.println(e1.id+" "+e1.name);
		System.out.println(e2.id+" "+e2.name);
	}

}
