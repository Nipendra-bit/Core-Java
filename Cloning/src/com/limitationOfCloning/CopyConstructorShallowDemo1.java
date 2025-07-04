package com.limitationOfCloning;
//in copy constructor it also shows error in case of object reference
//its solution is deep copy constructor cloning
class Course
{
	String course;
	public Course(String course)
	{
		this.course=course;
	}
}
class Employees
{
	int id;
	String name;
	Course c;
	
	public Employees(int id,String name,Course c) //normal constructor
	{
		this.id=id;
		this.name=name;
		this.c=c;
	}
	
	public Employees(Employees other) //copy constructor (takes another object of the same class as an argument and copy its fields
	{
		this.id=other.id;
		this.name=other.name;
		this.c=other.c;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+c.course);
	}
}

public class CopyConstructorShallowDemo1 {

	public static void main(String[] args) {
		
		Course c=new Course("Spring");
		Employees e=new Employees(101,"Nipendra",c);
		e.display();
		Employees ec=new Employees(e); //shallow cloning
		ec.display();
	}

}
