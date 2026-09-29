package com.sunbeam;

import java.util.Scanner;

class ExceptionLineTooLong extends Exception {

	private String message;
	
	public ExceptionLineTooLong(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}

public class Que1 {
	public static boolean checkString(String str) throws ExceptionLineTooLong {
		int length = str.length();
		if(length > 80) {
			throw new ExceptionLineTooLong("The String is too long");
		}
		System.out.println("String length is : " + length);
		return true;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("Enter String : ");
			String str = sc.nextLine();
			Que1.checkString(str);
		} catch (ExceptionLineTooLong e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();			
		}
		
	}

}
