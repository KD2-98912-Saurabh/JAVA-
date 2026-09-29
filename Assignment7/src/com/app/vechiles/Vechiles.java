package com.app.vechiles;

import java.sql.Date;
class InvalidDateException extends Exception{
	private String message;
	
	public InvalidDateException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
class DuplicateChasisException extends Exception{
private String message;
	
	public DuplicateChasisException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}

class InvalidCategoryException extends Exception {
	private String message;
	
	public InvalidCategoryException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}


public class Vechiles {
	private String chasisNo;
	private String color;
	private String category;
	private double price;
	private Date manufactureDate;
	
	public Vechiles(String chasisNo2, String color, String category, double price, Date manufactureDate) {
		this.chasisNo = chasisNo2;
		this.color = color;
		this.category = category;
		this.price = price;
		this.manufactureDate = manufactureDate;
	}

	public String getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		return "Vechiles [chasisNo=" + chasisNo + ", color=" + color + ", category=" + category + ", price=" + price
				+ ", manufactureDate=" + manufactureDate + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null) {
			return false;
		}
		
		if(this == obj) {
			return true;
		}
		
		if(!(obj instanceof Vechiles)) {
			return false;
		}
		
		Vechiles other = (Vechiles) obj;
		return this.chasisNo.compareTo(other.chasisNo) == 0;
	}
}
