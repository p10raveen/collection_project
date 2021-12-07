package com.list;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(66);
		al.add(32);
		al.add(100);
		al.add(45);
		al.add(78);
		System.out.println("al: "+al);//[66, 32, 100, 45, 78]
		
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(66);
		al2.add(132);
		al2.add(110);
		al2.add(45);
		al2.add(178);
		System.out.println("al2: "+al2); //[ 66, 132, 110, 45, 178]
		
		al.addAll(al2);
		System.out.println("after add All elements of a2,then al: "+al);
		//[66, 32, 100, 45, 78, 66, 132, 110, 45, 178]
		
		al.removeAll(al2);
		System.out.println("after remove All elements of a2,then al: "+al);
		//[32, 100, 78]
		al.addAll(al2);
		al.retainAll(al2);
		System.out.println("after retain All elements of a2,then al: "+al);
		//[66, 132, 110, 45, 178]
	}

}
