package anujBhaiya;

public class KadanesLargestSumContiSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,-4,-2,6,-1};
		System.out.println("Maximum contiguous subarray sum is:"+maxSubArraySum(arr));
			}

	static int maxSubArraySum(int a[])
	{
		int maxSum=Integer.MIN_VALUE;
		int size=a.length;
		int currentSum=0;
		for(int i=0;i<size;i++)
		{
			currentSum=currentSum+a[i];
			if(currentSum>maxSum)
			{
				maxSum=currentSum;
			}
			if(currentSum<0)
			{
				currentSum=0;
			}
			
			
		}
		return maxSum;
		
	}
	
	
}
