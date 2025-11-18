package mypack;

public class BinaryThroughRecursion {

	public static void main(String[] args) {

		int[] arr= {2,4,7,9,11,33,45,78,90,112,223,344};//sorted array

		int start=0;
		int end=arr.length-1;

		int target=112;

		System.out.println(binary(arr,start,end,target));

	}

	public static int binary(int[] arr,int s,int e,int tar)
	{
		if(s>e)
		{
			return -1;
		}

		int mid=s+(e-s)/2;

		if(arr[mid]==tar)
		{
			return mid;
		}

		if(arr[mid]>tar)
		{
			return binary(arr,s,mid-1,tar);
		}

		return binary(arr,mid+1,e,tar);
	}

}
