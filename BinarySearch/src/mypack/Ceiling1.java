package mypack;

public class Ceiling1 {

	public static void main(String[] args) {
		int arr[]= {2,3,5,7,9,12,15,16,19,21};
		int target=18;
		int ans=ceilingSearch(arr,target);
		System.out.println(ans);
	}
	public static int ceilingSearch(int arr[],int target)
	{
		if(target>arr[arr.length-1])
		{
			return -1;
		}
		int start=0;
		int end=arr.length-1;
		int mid=0;
		
		while(start<=end)
		{
			mid=start+(end-start)/2;
			
			if(arr[mid]==target)
			{
				return mid;
			}
			else if(arr[mid]<target)
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		return start;
	}
}
