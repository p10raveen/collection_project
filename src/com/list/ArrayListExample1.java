package com.list;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(66);
		al.add(32);
		al.add(100);
		al.add(45);
		al.add(78);
		System.out.println(al); // [66, 32, 100, 45, 78]
		al.remove(0); // 0 is an index number
		System.out.println(al); // [32, 100, 45, 78]
		System.out.println(al.size());// 4
		System.out.println(al.contains(100));// true
		al.clear();
		System.out.println(al.isEmpty()); // true
		
	}
}
