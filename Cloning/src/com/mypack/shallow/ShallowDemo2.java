package com.mypack.shallow;
//it fails in case of has-a (object reference)
//it doesn't create clone of the object reference just copy its reference in the cloned object
class Course
{
	String course;
	public Course(String course)
	{
		this.course=course;
	}
}
class Student implements Cloneable
{
	int rno;
	String name;
	Course c; //has-a or //object reference
	public Student(int x,String y,Course z)
	{
		rno=x;
		name=y;
		c=z;
	}
	public void show()
	{
		System.out.println(rno+" "+name+" "+c.course);
	}
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone(); //shallow cloning is done
	}
}

public class ShallowDemo2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		System.out.println("creating cours obj");
		Course c=new Course("spring");
		System.out.println("creating student obj & assign course to it");
		Student s=new Student(101,"Nipendra",c);
		System.out.println("details of obj to be clone");
		s.show();
		Student temp=(Student)s.clone(); //call goes to clone method and here type cast it in student as it return object
		System.out.println("details of cloned obj");
		temp.show();
		temp.c.course="hibernate";
		System.out.println("******************************");
		s.show();
		temp.show();
	}

}
