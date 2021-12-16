package anujBhaiya;

public class NegativeLeftPositiveRight {
	
	public static void reArrange(int arr[],int n)
	{
		int pivot=0,temp;
		for(int i=0;i<n;i++)
		{
			if(arr[i]<0)
			{
				if(i!=pivot)
				{
					temp=arr[i];
					arr[i]=arr[pivot];
					arr[pivot]=temp;
				}
				pivot++;
			}
		}
	}

	public static void printArray(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-1,2,-3,4,5,6,-7,8,9};
		int n=arr.length;
		reArrange(arr,n);
		printArray(arr,n);

	}

}
