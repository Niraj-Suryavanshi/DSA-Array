package anujBhaiya;

public class UnionIntersection {

	public static void main(String arg[])
	{
		int arr1[]= {1,2,4,5,6};
		int arr2[]= {2,3,5,7};
		int m=arr1.length;
		int n=arr2.length;
		find_intersection(arr1,arr2,m,n);
		find_union(arr1,arr2,m,n);
	}

	 static int find_union(int[] arr1, int[] arr2,int m,int n)
	{
		
		int i=0,j=0;
		System.out.println("Union is:");
		while(i<m && j<n)
		{
			if(arr1[i]>arr2[j])
			{
				System.out.println(arr2[j]);
				j++;
			}
			
			else if(arr1[i]<arr2[j])
			{
				System.out.println(arr1[i]);
				i++;
			}
			
			else 
			{
				System.out.println(arr2[j]);
				j++;
				i++;
			}
		}
		
		while(i<m) {
			System.out.println(arr1[i]);
			i++;
		}
		while(j<n) {
			System.out.println(arr2[j]);
			j++;
		}
		
		return 0;
	}
	

	public static void find_intersection(int[] arr1, int[] arr2,int m,int n)
	{
	
		int i=0,j=0;
		System.out.println("Intersection is:");
		while(i<m && j<n)
		{
			if(arr1[i]<arr2[j])
			{
				
				i++;
			}
			
			else if(arr1[i]>arr2[j])
			{
				
				j++;
			}
			
			else 
			{
				System.out.println(arr2[j]);
				j++;
				i++;
			}
		}
	
	
	}
}
