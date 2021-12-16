package anujBhaiya;

public class ReverseArray {

	public static void reverseArray(int arr[],int start,int end)
	{
		int temp;
		
		
			while(start<end)
			{
				temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		
		
	}
	public static void printArray(int arr[],int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int n=arr.length;
		reverseArray(arr,0,5);
		printArray(arr,n);
	}

}
