package com.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		ll.add("aman");
		ll.add("vishal");
		ll.add("pooja");
		ll.add("rahul");
		System.out.println(ll);
		
		ListIterator<String> itr = ll.listIterator();
		System.out.println("forward direction:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("\nreverse direction:");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}

}
