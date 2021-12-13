package com.projects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Project1 {
	public static void displayEmp(ArrayList<ArrayList<String>> det)
	{
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");
		System.out.println("---------------------------------------------------------------------------");
		for(ArrayList<String> al: det)
		{
			System.out.format("%-15s %-15s %-15s %-30s %-15s\n", al.get(0), al.get(1), al.get(2), al.get(3), al.get(4));
		}
		System.out.println("---------------------------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<String>> details = new ArrayList<ArrayList<String>>();
		/*
		 [[first,last,mobile,email,address],[first,last,mobile,email,address]]
		 */
		System.out.print("Enter Number of employee: ");
		int noe = sc.nextInt();
		sc.nextLine();
		if(noe>0)
		{
			for(int i=0;i<noe;i++)
			{
				ArrayList<String> emp = new ArrayList<String>(); //[first,last,mobile,email,address]
				System.out.print("Enter First Name: ");
				emp.add(sc.nextLine());
				System.out.print("Enter Last Name: ");
				emp.add(sc.nextLine());
				System.out.print("Enter Mobile: ");
				emp.add(sc.nextLine());
				System.out.print("Enter Email: ");
				emp.add(sc.nextLine());
				System.out.print("Enter Address: ");
				emp.add(sc.nextLine());
				details.add(emp);
			}
			displayEmp(details);
		}
		else
		{
			System.out.print("Wrong Input");
		}
	}

}
