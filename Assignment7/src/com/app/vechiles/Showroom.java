package com.app.vechiles;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Showroom {
	public static Scanner sc = new Scanner(System.in);
	public static List<Vechiles> arr= new ArrayList<>();
	
	public static void acceptRecord() {

	    try {

	        System.out.println("Enter Chasis Number : ");
	        String chasisNo = sc.next();

	        System.out.println("Color : ");
	        String color = sc.next();

	        System.out.println("Category : ");
	        String category = sc.next();

	        System.out.println("Price : ");
	        double price = sc.nextDouble();

	        System.out.println("Date (yyyy-MM-dd) : ");
	        String date = sc.next();

	        Date manufactureDate = Date.valueOf(date);

	        Vechiles v1 = new Vechiles(chasisNo.toLowerCase(), color, category.toLowerCase(), price, manufactureDate);

	        Date startDate = Date.valueOf("2021-04-01");
	        Date endDate = Date.valueOf("2022-03-31");

	        if (manufactureDate.before(startDate) || manufactureDate.after(endDate)) {
	            throw new InvalidDateException("Invalid Manufacture Date");
	        }

	        if (arr.contains(v1)) {
	            throw new DuplicateChasisException("Chasis Number already exists");
	        }

	        if (!(category.equals("petrol")
	                || category.equals("diesel")
	                || category.equals("ev")
	                || category.equals("hybrid")
	                || category.equals("cng"))) {

	            throw new InvalidCategoryException("Invalid Category!");
	        }

	        arr.add(v1);

	    } catch (DuplicateChasisException e) {
	        System.out.println(e.getMessage());

	    } catch (InvalidDateException e) {
	        System.out.println(e.getMessage());

	    } catch (InvalidCategoryException e) {
	        System.out.println(e.getMessage());
	    }
	}
	
	public static void printRecord () {
		for(Vechiles vechiles : arr) {
			System.out.println(vechiles.toString());
		}
	}
	
	public static int  menuList() {
		int choice;
		System.out.println("Enter Choice : ");
		System.out.println("0. Exit");
		System.out.println("1. Add Vehicle ");
		System.out.println("2. Display All Vehicle");
		choice = sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		int choice ;
		while ((choice = menuList())!= 0) {
			switch (choice) {
			case 1:
				Showroom.acceptRecord();
				break;
			case 2:
				Showroom.printRecord();
				break;
			}
		}
	}
}
