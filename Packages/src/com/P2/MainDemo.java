package com.P2;
import com.P1.A;
public class MainDemo {

	public static void main(String[] args) {
	
		A obj=new A();
		
		System.out.println(obj.add(1, 2));
		System.out.println(obj.subtract(5, 1));
		System.out.println(obj.multiply(4, 5));
		System.out.println(obj.div(4, 2));

	}

}
