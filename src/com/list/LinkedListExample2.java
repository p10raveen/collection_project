package com.list;

import java.util.LinkedList;

public class LinkedListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		ll.add("aman");
		ll.add("vishal");
		ll.add("pooja");
		ll.add("rahul");
		System.out.println("original LL:"+ll); // [aman, vishal, pooja, rahul]
		
		LinkedList ab = (LinkedList) ll.clone();
		System.out.println("clone: "+ab); // [aman, vishal, pooja, rahul]
		
		ll.add("rohini");
		ll.add("vikas");
		System.out.println("original LL:"+ll);// [aman, vishal, pooja, rahul, rohini, vikas]
		System.out.println("clone: "+ab); // [aman, vishal, pooja, rahul]
		
	}

}
