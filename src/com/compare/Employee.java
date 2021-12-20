package com.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employee {
	String name;
	String designation;
	double salary;
	
	Employee(String name,String designation,double salary)
	{
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee("abc","programmer",45454.5));
		al.add(new Employee("xyz","programmer",45454.5));
		al.add(new Employee("def","programmer",45454.5));
		al.add(new Employee("bcd","programmer",45454.5));
		al.add(new Employee("pqr","programmer",45454.5));
		
		Collections.sort(al,new CompareName());
		Iterator<Employee> itr = al.iterator();
		while(itr.hasNext())
		{
			Employee e = itr.next();
			System.out.println(e.name+" "+e.designation+" "+e.salary);
		}
		
	}

}
