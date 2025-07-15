package com.mypack.types;
class A //parent class
{
	public void showA()
	{
		System.out.println("Hello! A");
	}
}

public class SingleDemo extends A{       //child class

	int a;
	public void showB()
	{
		System.out.println("Hello! B");
	}
	
	public static void main(String[] args) {
		
		SingleDemo obj=new SingleDemo(); //child class has both methods showA and showB
		obj.showA();
		obj.showB();
		
		A obj1=new A();
		obj1.showA();  //it only has showA method.
	}

}
