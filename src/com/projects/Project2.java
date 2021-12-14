package com.projects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Project2 {
	static ArrayList<String> item = new ArrayList<>();
	public static boolean status = true;
	
	public static void search()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Item to search: ");
		String i = sc.nextLine();
		String res = (item.contains(i))?"Item found in the list":"Item not found in the list";
		System.out.println(res);
		menu();
		
	}
	
	public static void sorting()
	{
		Collections.sort(item);
		menu();
		
	}
	
	public static void shuffling()
	{
		Collections.shuffle(item);
		menu();
		
	}
	
	public static void reversing()
	{
		Collections.reverse(item);
		menu();
		
	}
	
	public static void replaceItem()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("there are "+item.size()+" elements in the list");
		System.out.print("Enter index no (0 to "+(item.size()-1)+") that you want to replace: ");
		int index = sc.nextInt();
		sc.nextLine();
		if(index<item.size())
		{
			System.out.println("Element at index "+index+" is "+item.get(index));
			System.out.println("What do you want to replace it with? ");
			String rep = sc.nextLine();
			item.remove(index);
			item.add(index,rep);
			System.out.println("Item replace successfully");
		}
		else
		{
			System.out.println("that's an invalid element");
			replaceItem();
		}
		
		menu();
		
	}
	
	public static void delete()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Item to delete: ");
		String i = sc.nextLine();
		String res = (item.contains(i))?"Item found in the list":"Item not found in the list";
		if(res.equals("Item found in the list"))
		{
			item.remove(i);
			System.out.println("Item Removed");
		}
		else
		{
			System.out.println("Item doesnot exist");
		}
		menu();
		
	}
	
	public static void appExit()
	{
		System.out.println("Exiting. . . Thanks for using the application!!");
	}
	
	public static void insert()
	{
		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine();
		item.add(i);
		System.out.println("Inserted Successfully");
		menu();
		
	}
	
	public static void display()
	{
		System.out.println("The items in the list are: ");
		for(String i: item)
		{
			System.out.println(i);
		}
		menu();
		
	}
	
	public static void enterChoice()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		System.out.println();
		while(status)
		{
			if(choice==1)
			{
				insert();
			}
			else if(choice==2)
			{
				search();
			}
			else if(choice==3)
			{
				delete();
			}
			else if(choice==4)
			{
				display();
			}
			else if(choice==5)
			{
				replaceItem();
			}
			else if(choice==6)
			{
				sorting();
			}
			else if(choice==7)
			{
				shuffling();
			}
			else if(choice==8)
			{
				reversing();
			}
			else if(choice==9)
			{
				appExit();
				status=false;
				break;
				
			}
			else
			{
				System.out.println("Enter Valid input");
				menu();
			}
		}
		
	}
	public static void menu()
	{
		System.out.println("\n\nMAIN MENU");
		System.out.println("---------");
		System.out.println("1. Insert");
		System.out.println("2. Search");
		System.out.println("3. Delete");
		System.out.println("4. Display");
		System.out.println("5. Replace");
		System.out.println("6. Sort");
		System.out.println("7. Shuffle");
		System.out.println("8. Reverse");
		System.out.println("9. Exit");
		enterChoice();
		
	}
	public static void main(String[] args) {
		
		menu();

	}

}
