package anujBhaiya;
import java.util.*;
public class MedianOfAStream {

	
		// TODO Auto-generated method stub
		PriorityQueue<Integer>maxHeap=new PriorityQueue<>(Collections.reverseOrder());//containing first of a number
		PriorityQueue<Integer>minHeap=new PriorityQueue<>();//containing second half of a number
		
		public void insertNum(int num)
		{
			if(maxHeap.isEmpty()||maxHeap.peek()>=num)
				maxHeap.add(num);
			else
				minHeap.add(num);
			
			//either both the heaps will have equal number of elements or
			//max will have more element than min heap
			if(maxHeap.size()>minHeap.size()+1)
				minHeap.add(maxHeap.poll());
			else if (maxHeap.size()<minHeap.size())
				maxHeap.add(minHeap.poll());
			
		}
		
		public double findMedian()
		{
			if(maxHeap.size()==minHeap.size())
			{
				//we have even number of elements,take the average of middle two elements
				return maxHeap.peek()/2.0 + minHeap.peek()/2.0;
			}
			//because max-heap will have one more element than the min heap
			return maxHeap.peek();
		}
		
		public static void main(String[] args) {
			
			MedianOfAStream obj=new MedianOfAStream();
			obj.insertNum(3);
			obj.insertNum(1);
			
			System.out.println("The median is: "+obj.findMedian());
			
			obj.insertNum(5);
			obj.insertNum(4);
			System.out.println("The median is: "+obj.findMedian());

			
		
	}

}
