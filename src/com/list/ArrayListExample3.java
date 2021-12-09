package com.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample3 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(66);
		al.add(32);
		al.add(100);
		al.add(45);
		al.add(78);
		System.out.println(al);
		
		 // iteration by Iterator interface
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		/*
		// iteration by for-each loop
		for(int a :al)
		{
			System.out.println(a);
		}
		
		// iteration by normal for loop
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i)); 
		}
		*/
	}

}
