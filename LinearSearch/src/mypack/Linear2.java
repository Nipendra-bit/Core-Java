package mypack;

import java.util.Arrays;
import java.util.Scanner;

//problem on linear search
//frequency checking of inputed number
public class Linear2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		int arr[]= {1,2,3,4,5,2,4,2,5};
		int count=0;
		int flag=0;
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("enter the num");
		int num=sc.nextInt();
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				flag=1;
				count++;
				//continue;
			}
		}
		
		if(flag==0)
		{
			System.out.println("elemnt is not found");
		}
		else
		{
			System.out.println("elemnt is found");
			System.out.println(num+" "+"has a frequency of: "+count);
		}

	}

}
