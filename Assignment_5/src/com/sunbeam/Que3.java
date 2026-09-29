package com.sunbeam;
import java.util.Scanner;

public class Que3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		
		str = str.trim();
		String arr[] =  str.split(" ");
		int count = arr.length;
		
		System.out.print("Number of words : " + count);
		
		sc.close();
	}	
}
