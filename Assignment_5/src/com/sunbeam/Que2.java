package com.sunbeam;
import java.util.Scanner;

public class Que2 {
	public static boolean checkPalindrome(String str) {
		int left = 0 ;
		int right = str.length() - 1;
		
		while(left <= right ) {
			
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		
		if(checkPalindrome( str)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
		
		sc.close();
	}
}
