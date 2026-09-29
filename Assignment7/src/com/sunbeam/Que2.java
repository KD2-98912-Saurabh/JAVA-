package com.sunbeam;

import java.awt.print.Printable;
import java.util.Scanner;

class NegativeDiameterException extends Exception {
	private String message;
	
	public NegativeDiameterException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
}
class Circle{
	private double myX;
	private double myY;
	private double myDiameter;
	
	public Circle() {
		this.myX = 0;
		this.myY = 0;
		this.myDiameter = 100;
	}

	public double getMyX() {
		return myX;
	}

	public void setMyX(double myX) {
		this.myX = myX;
	}

	public double getMyY() {
		return myY;
	}

	public void setMyY(double myY) {
		this.myY = myY;
	}

	public double getMyDiameter() {
		return myDiameter;
	}

	public void setMyDiameter(double myDiameter) {
		this.myDiameter = myDiameter;
	}
	
}

public class Que2 {
	
	public static void checkDiameter(int diameter) throws NegativeDiameterException {
		if(diameter < 0) {
			throw new NegativeDiameterException("Diameter should not be negative");
		}
		System.out.println("Valid Diameter");
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Circle sCircle = new Circle();
		
		try {
			System.out.println("Enter Diameter");
			int diameter = scanner.nextInt();
			sCircle.setMyDiameter(diameter);
			Que2.checkDiameter(diameter);
		} catch (Exception e) {
				System.out.println(e.getMessage());
		}
		
		
	}
}
