package anujBhaiya;

public class RotateArrayBy2 {
	
	public static void leftRotate(int arr[],int d,int n)
	{
		for(int i=0;i<d;i++)
			leftRotateByOne(arr,n);
		
	}
	
	public static void leftRotateByOne(int arr[],int n)
	{
		int temp=arr[0];
		for(int i=0;i<n-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[n-1]=temp;
	}
	
	public static void printArray(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		System.out.print(arr[i]);
	}
	
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7};
		int n=arr.length;
		System.out.println("Before rotate:");
		printArray(arr,n);
		System.out.println();
		leftRotate(arr,2,7);
		System.out.println("After rotate:");
		printArray(arr,n);
		
	
		
		
	}

}
