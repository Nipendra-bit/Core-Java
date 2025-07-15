package com.P1;

public class P {
	private int a=1;//within the class
	protected int b=5;
	int c=6; //bydefault its default.
	public int d=7;
	
	public static void main(String[] args)
	{
	P obj=new P();
	System.out.println(obj.a);
}

}