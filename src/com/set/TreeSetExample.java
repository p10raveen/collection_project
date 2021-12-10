package com.set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<>();
		ts.add("aman");
		ts.add("pooja");
		ts.add("alok");
		ts.add("aman");
		ts.add("shivani");
		ts.add("alok");
		System.out.println(ts);// [alok, aman, pooja, shivani]
	}

}
