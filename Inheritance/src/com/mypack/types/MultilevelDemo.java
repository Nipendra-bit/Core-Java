package com.mypack.types;

class P
{
	public void showP()
	{
		System.out.println("Hello! P");
	}
}

class Q extends P
{
	public void showQ()
	{
		System.out.println("Hello! Q");
	}
}

class R extends Q
{
	public void showR()
	{
		System.out.println("Hello! R");
	}
}
public class MultilevelDemo {

	public static void main(String[] args) {
		
		R c=new R(); //c class has all the methods from class A to itself
		c.showP();
		c.showQ();
		c.showR();
		
		Q b=new Q(); // b class has all the methods from class A to itself
		b.showP();
		b.showQ();
		
		P a=new P(); //a class has only one method
		a.showP();
	}

}
