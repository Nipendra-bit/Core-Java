package mypack;

import java.util.Arrays;
import java.util.Scanner;

public class Binary2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int arr[]= {20,19,16,12,11,9,6,5,4,3,2};
		System.out.println(Arrays.toString(arr));
		System.out.println("enter the target eleents: ");
		int target=sc.nextInt();
		int ans=binarySearch(arr, target);
		System.out.println(ans);
	}
	public static int binarySearch(int arr[],int target)
	{
		int start=0;
		int end=arr.length-1;
		
		boolean isAsc=arr[start]<arr[end];
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(arr[mid]==target)
			{
				return mid;
			}
			
			if(isAsc==true)
			{
				if(target<arr[mid])
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
			else
			{
				if(target<arr[mid])
				{
					start=mid+1;
				}
				else
				{
					end=mid-1;
				}
			}
		}
		return -1;
	}
}
