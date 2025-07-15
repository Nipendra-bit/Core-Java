package com.mypack.inheritance;
//inheritance facilitate is-a relationship
class Animal //Animal is the  super class and its properties is gone in the child class
{
	public void eat()
	{
		System.out.println("I am eating");
	}
}
public class InheritanceDemo1 extends Animal{ 

	public static void main(String[] args) {
		
		InheritanceDemo1 obj=new InheritanceDemo1();
		obj.eat();
	}

}
