package com.list;

import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		ll.add("aman");
		ll.add("vishal");
		ll.add("pooja");
		ll.add("rahul");
		ll.add("rohini");
		ll.addFirst("vikas");
		ll.addLast("shivani");
		ll.add("james");	
		System.out.println(ll); // [vikas, aman, vishal, pooja, rahul, rohini, shivani, james]
		
		ll.remove(2); // where 2 is an index number
		System.out.println(ll);// [vikas, aman, pooja, rahul, rohini, shivani, james]
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll); // [aman, pooja, rahul, rohini, shivani ]
		System.out.println(ll.get(2));// rahul
		System.out.println(ll.getFirst());// aman
		System.out.println(ll.getLast());// shivani
		System.out.println(ll.indexOf("rohini"));//3
		System.out.println(ll.indexOf("vikas"));// -1, bcoz 'vikas' is not in the list
	}

}
