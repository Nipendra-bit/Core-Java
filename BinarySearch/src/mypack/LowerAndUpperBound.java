package mypack;

public class LowerAndUpperBound {

	public static void main(String[] args) {
		int arr[] = {4,6,10,12,18,20,34,56,67,78};
		int k= 78;
		int ans=boundFound(arr,k);
		boundChecker(ans,arr);
}
	public static int boundFound(int arr[] , int k)
	{
		int start=0;
		int end = arr.length-1;
		        
		while (start<=end)
		{
			int mid= start+ (end-start)/2;
		            
		    if(arr[mid]==k)
		    {
		    	return mid;
		    }
		            else if(k<arr[mid])
		            {
		                end= mid-1;
		            }
		             else{
		                start=mid+1;
		            }
		        }
		        return  -1;
		    }
		    public static int boundChecker(int mid,int arr[])
		    {
		        if(mid==-1)
		        {
		            return -1;
		        }
		        
		        int lowerBound=0;
		        System.out.println("Lower Bound at index "+ mid+": "+arr[mid]);
		        
		        int N=arr.length;
		        
		        if(mid+1 > N-1)
		        {
		            System.out.println("Upper Bound doen'nt exist");
		        }
		        else
		        {
		            System.out.println("Upper Bound at index "+ (mid+1)+": "+arr[mid+1]);
		        }
		        return -1;
		    }
}

