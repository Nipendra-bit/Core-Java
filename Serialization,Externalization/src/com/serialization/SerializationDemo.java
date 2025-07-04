package com.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable 
{
	private static final long serialVersionUID=1L;
	int id;
	String name;
	String salary;
	
	public Employee(int id,String name,String salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+salary);
	}
		
}

public class SerializationDemo {

	public static void main(String[] args){
		
		try {
			Employee e1=new Employee(101,"Nipendra","5050");
			Employee e2=new Employee(102,"Garima","48484");
			System.out.println("Two employee objects are going to  serialized");
			e1.display();
			e2.display();
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("exam.ser"));
			oos.writeObject(e1);
			oos.writeObject(e2);
			Thread.sleep(2000);
			System.out.println("Objects is serialized");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
