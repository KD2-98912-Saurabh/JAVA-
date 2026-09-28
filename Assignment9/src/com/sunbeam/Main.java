package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static ArrayList<Student>studentList = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);
	
	public static void addStudent()
	{
		System.out.println("Enter the student you want to add :");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
		
			System.out.println("Enter the roll No:");
			int rollNo = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter the Name");
			String name = sc.nextLine();
			
			System.out.println("Enter the Marks");
			double marks= sc.nextDouble();
			
			Student s = new Student(rollNo, name, marks);
			studentList.add(s);
			
			System.out.println("Student added successfully......");
			
		}
		
	}
	
	
	public static void displayAllStudent()
	{
		 Iterator<Student>s= studentList.iterator();
		 while(s.hasNext())
		 {
			 System.out.println(s.next());
		 }
	}
	
	public static Student searchStudentById(int rollNo)
	{
		Student ifFound = null;
		
		if(studentList!=null)
		{
			for(Student s:studentList)
			{
				if(s.getRollNo()==rollNo)
				{
					ifFound = s;
					break;
					
				}
			}
		}
		
		if(ifFound!=null)
		{
			return ifFound;
		}
		return null;
	}
	
	public static Comparator<Student> sortStudentOnRollNo()
	{
		 Comparator<Student>sortOnRollNo = (x,y)->x.getRollNo()-y.getRollNo();
		 return sortOnRollNo;
	}
	
	public static Comparator<Student> sortStudentOnName()
	{
		 Comparator<Student>sortOnName = (x,y)->x.getName().compareTo(y.getName());
		 return sortOnName;
	}
	
	public static Comparator<Student> sortStudentOnMarks()
	{
		 Comparator<Student>sortOnMarks = (x,y)->Double.compare(x.getMarks(), y.getMarks());
		 return sortOnMarks;
	}

	public static void main(String[] args) {
		
		boolean isT = true;
		
		while(isT)
		{
			int ch;
			System.out.println("\n1.add student \n2.Display all Student \n3.search on RollNo \n4.sort on rollNo \n5.sort on name \n6.sort on marks \n0.exit");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
			{
				addStudent();
				break;
			}
			
			case 2:
			{
				displayAllStudent();
				break;
			}
			
			case 3:
			{
				System.out.println("Enter roll No");
				int rollNo = sc.nextInt();
				 Student s= searchStudentById(rollNo);
				  if(s != null)
			            System.out.println(s);
			        else
			            System.out.println("Student not found");

				
				break;
			}
			
			case 4:
			{
				studentList.sort(sortStudentOnRollNo());
				  System.out.println("Students sorted by Roll No:");
			        displayAllStudent();
				
				break;
			}
			case 5:
			{
				studentList.sort(sortStudentOnName());
//				 System.out.println(s.ge)
				System.out.println("Students sorted by Name:");
		        displayAllStudent();
				break;
			}
			
			case 6:
			{
				studentList.sort(sortStudentOnMarks());
				System.out.println("Students sorted by Marks:");
		        displayAllStudent();
				
				break;
			}
			
			case 0:
			{
				isT=false;
				break;
			}
			
			default:
			{
				System.out.println("invalid choice...");
			}
			
			}
			
		}

	}

}
