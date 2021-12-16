package anujBhaiya;

import java.util.Scanner;

public class HeapInsert {
	static int n=5;

	 static void insert(int a[],int n,int key)
	{
		n=n+1;
		a[n]=key;
		int i=n;
		while(i>1)
		{
			int parent=i/2;
			if(a[parent]<a[i])
			{System.out.println();
				swap(a,parent,i);
				System.out.println("Parent="+parent+"Child="+i);
				i=parent;
			}
			else
			{
				return;
			}
		}
	}
	
	 static void printArray(int arr[], int n)
	    {
	        for (int i = 1; i <=n; i++)
	            System.out.print(arr[i] + " ");
	    }
	
	 public static void swap(int a[],int parent,int i)
	{
		int temp=a[parent];
		a[parent]=a[i];
		a[i]=a[temp];
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				
		
		int a[]=new int[100];
		a[0]=0;
		a[1]=10;
		a[2]=5;
	    a[3]=3;
	    a[4]=2;
	    a[5]=4;		
		
		
		int key=15;
		
		printArray(a, n);
		
		insert(a,n,key);
		
		
		
		System.out.println("After Inserting");
		printArray(a, n);
		sc.close();
		

}
}
