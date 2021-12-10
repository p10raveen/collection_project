package com.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq =new PriorityQueue<>();
		pq.add("aman");
		pq.add("pooja");
		pq.add("shivani");
		pq.add("vikas");
		pq.add("rohit");
		System.out.println(pq); // [aman, pooja, shivani, vikas, rohit]
		
		pq.remove(); // first element out from the queue
		System.out.println(pq);//[pooja, shivani, vikas, rohit]
		
		pq.offer("Rahul");
		System.out.println(pq);// [Rahul, pooja, shivani, vikas, rohit]
		
		String value = pq.poll();
		System.out.println(value);// Rahul
		System.out.println(pq);// [pooja, rohit, shivani, vikas]
		
		System.out.println(pq.element());//pooja
		System.out.println(pq);//[pooja, rohit, shivani, vikas]
		
		System.out.println(pq.peek());// pooja
	}
}
