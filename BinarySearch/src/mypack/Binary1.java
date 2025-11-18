package mypack;

import java.util.*;
public class Binary1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int arr[]= {2,3,4,5,6,8,9,23,34,56,67};
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("enter the target eleents: ");
		int target=sc.nextInt();
		
		int ans=binarySearch(arr, target);
		System.out.println(ans);
	}
	public static int binarySearch(int arr[],int target)
	{
		int start=0;
		int end=arr.length;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(target<arr[mid])
			{
				end=mid-1;
			}
			else if(target>arr[mid])
			{
				start=mid+1;
			}
			else
			{
				return mid;
			}
		}
		return start;
	}
}
