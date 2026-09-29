package com.app.vehicle;

import java.util.Objects;

public class Vehicle {
	private int chasisNo;
	private String color;
	private double price;
	
	public Vehicle() {
		
	}

	
	public Vehicle(int chasisNo, String color, double price) {
		this.chasisNo = chasisNo;
		this.color = color;
		this.price = price;
	}


	public int getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(int chasisNo) {
		this.chasisNo = chasisNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("[ ChasisNo : %d , Color : %s  , Price : %.2f" , chasisNo , color , price);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(this== obj) {
			return true;
		}
		
		if(!(obj instanceof Vehicle)) {
			return false;
		}
		
		Vehicle other = (Vehicle) obj;
		return this.chasisNo == other.chasisNo; 
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(chasisNo);
	}
	
}
