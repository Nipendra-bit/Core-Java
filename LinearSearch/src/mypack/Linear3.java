package mypack;

import java.util.*;

public class Linear3 {

	public static void main(String[] args) {
		
		int[] arr= {2,3,4,5,2,4,7,8,2};
		int j=0,k=0;
		int flag,count,n;
		
		for(int i=0;i<arr.length;i++)
		{
			flag=0;
			n=arr[i];
			count=0;
			
			for(j=i-1;j>=0;j--)
			{
				if(n==arr[j])
				{
					flag=1;
					break;
				}
			}
			
			if(flag==0)
			{
				for(k=0;k<arr.length;k++)
				{
					if(n==arr[k])
					{
						count++;
					}
				}
				System.out.println(n+" freq is: "+count);
			}
		}

	}

}
