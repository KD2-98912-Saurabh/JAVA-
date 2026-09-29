package com.tester;
import java.util.Scanner;

import com.app.vehicle.Vehicle;

public class Que3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Vehicle 1 Details : ");
		System.out.println("Chasis No : ");
		int chasisNo = scanner.nextInt();
		System.out.println("Color : ");
		String color = scanner.next();
		System.out.println("Price : ");
		double price = scanner.nextDouble();
		Vehicle v1=new Vehicle(chasisNo , color , price);
		
		System.out.println("Enter Vehicle 2 Details : ");
		System.out.println("Chasis No : ");
		int chasisNo2 = scanner.nextInt();
		System.out.println("Color : ");
		String color2 = scanner.next();
		System.out.println("Price : ");
		double price2 = scanner.nextDouble();
		Vehicle v2=new Vehicle(chasisNo2 , color2 , price2);
		
		if(v1.equals(v2)) {
			System.out.println("SAME");
		}else {
			System.out.println("DIFFERENT");
		}
		scanner.close();
	}
}
