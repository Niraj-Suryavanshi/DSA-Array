package anujBhaiya;

import java.util.PriorityQueue;

public class N_Ropes_add_Priority_queue {
	
	static int mincost(int arr[])
	{
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			pQueue.add(arr[i]);
		}
		int ans=0;
		while(pQueue.size()>1)
		{
			int first=pQueue.poll();
			int second=pQueue.poll();
			int sum=first+second;
			ans+=sum;
			pQueue.add(sum);
		}
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,4,1,6,7};
		System.out.println(mincost(arr));;

	}

}
