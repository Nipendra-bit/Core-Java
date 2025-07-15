package com.mypack.types;

class X
{
	public void showX()
	{
		System.out.println("Hello! X");
	}
}

class Y extends X
{
	public void showY()
	{
		System.out.println("Hello! Y");
	}
}

class Z extends X
{
	public void showZ()
	{
		System.out.println("Hello! Z");
	}
}
public class HeirachicalDemo {

	public static void main(String[] args) {
		
		Y y=new Y();
		y.showX();
		y.showY();
		
		Z z=new Z();
		z.showX();
		z.showZ();
		
		X x=new X();
		x.showX();
	}

}
