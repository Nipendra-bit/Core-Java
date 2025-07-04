package com.mypack.deep;

class Course implements Cloneable
{
	String course_name;
	public Course(String course)
	{
		this.course_name=course;
	}
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
}
class Student implements Cloneable
{
	int rno;
	String name;
	Course c;//has-a 
	public Student(int x,String y,Course z)
	{
		rno=x;
		name=y;
		c=z;
	}
	public void show()
	{
		System.out.println(rno+" "+name+" "+c.course_name);
	}
	public Object clone()throws CloneNotSupportedException
	{
		Student ref=(Student)super.clone();
		ref.c=(Course)ref.c.clone(); //actual deep cloning done here
		return ref;
	}
}
class DeepDemo
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		System.out.println("creating course obj");
		Course c=new Course("spring");
		System.out.println("creating student obj & assign course to it");
		Student s=new Student(101,"abc",c);
		System.out.println("details of obj to be clone");
		s.show();
		Student temp=(Student)s.clone();
		System.out.println("details of cloned obj");
		temp.show();
		temp.c.course_name="hibernate";
		System.out.println("***********************");
		s.show();
		temp.show();
	}
}