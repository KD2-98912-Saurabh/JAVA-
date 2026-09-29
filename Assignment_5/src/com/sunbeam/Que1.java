package com.sunbeam;
import java.util.Scanner;
public class Que1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		System.out.println("Before String Reverse : " + str);
		
		String res = "" ;
		for(int i = 0 ; i < str.length(); i++) {
			res = str.charAt(i) + res;
		}
		System.out.println("After String is reverse : " + res);
		
		
		sc.close();
	}
}
