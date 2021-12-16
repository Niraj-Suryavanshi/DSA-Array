package anujBhaiya;

public class MaxMinOfArrayLessComparison {
	
	static class Pair{
		int min;
		int max;
		
	}

	static Pair Comparison(int arr[],int n)
	{
		Pair maxmin=new Pair();
		if(n==1)
		{
			maxmin.min=arr[0];
			maxmin.max=arr[0];
			return maxmin;
		}
		
		if(arr[0]>arr[1])
		{
			maxmin.max=arr[0];
			maxmin.min=arr[1];
		}else
		{
			maxmin.min=arr[0];
			maxmin.max=arr[1];
		}
		
		for(int i=2;i<n;i++)
		{
			if(arr[i]>maxmin.max)
			{
				maxmin.max=arr[i];
			}
			else if(arr[i]<maxmin.min)
			{
				maxmin.min=arr[i];
			}
		}
		
		return maxmin;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1000,11,445,330,3000};
		int size=5;
		Pair maxmin=Comparison(arr,size);
		System.out.println("Minimum Element is "+maxmin.min);
		System.out.println("Maximum Element is "+maxmin.max);
		
	}

}
