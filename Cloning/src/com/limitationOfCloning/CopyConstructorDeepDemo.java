package com.limitationOfCloning;
//deep cloning
class Courses
{
	String course;
	public Courses(String course)
	{
		this.course=course;
	}
}
class Employeee
{
	int id;
	String name;
	Courses c;
	
	public Employeee(int id,String name,Courses c) //normal constructor
	{
		this.id=id;
		this.name=name;
		this.c=c;
	}
	
	public Employeee(Employeee other) //copy constructor (takes another object of the same class as an argument and copy its fields
	{
		this.id=other.id;
		this.name=other.name;
		this.c=new Courses(other.c.course);
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+c.course);
	}
}

public class CopyConstructorDeepDemo {

	public static void main(String[] args) {
		
		Courses c=new Courses("Spring");
		Employeee e=new Employeee(101,"Nipendra",c);
		e.display();
		Employeee ec=new Employeee(e); 
		ec.display();
		System.out.println("*******************");
		ec.c.course="hibernate";
		e.display();
		ec.display();
	}

}
