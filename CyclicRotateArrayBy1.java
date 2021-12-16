package anujBhaiya;

import java.util.Arrays;

public class CyclicRotateArrayBy1 {

	static void rotate(int arr[])
	{
		int x=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=x;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		System.out.println("Given array is:");
		System.out.println(Arrays.toString(arr));
		rotate(arr);
		System.out.println("Rotated array is:");
		System.out.println(Arrays.toString(arr));
		
		

	}

}
