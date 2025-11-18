package mypack;

import java.util.*;
import java.util.Arrays;

//linear search
public class Linear1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the num");
		int num=sc.nextInt();
		
		int[] arr= {2,7,1,9,0,6,4,7};
		
		int flag=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				flag=1;
				System.out.println("element is found at postion: "+(i+1));
				break;//it terminate the for loop and go for the other statements.
			}
		}
		
		if(flag==0)
		{
			System.out.println("elemnt is not found");
		}
		
	}
}
