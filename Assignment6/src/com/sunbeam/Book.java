package com.sunbeam;

public class Book {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	
	public Book() {
		
	}

public Book(String isbn, double price, String authorName, int quantity) {
	this.isbn = isbn;
	this.price = price;
	this.authorName = authorName;
	this.quantity = quantity;
}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return String.format("Isbn : %s , Price : %.2f , Author Name : %s , Quantity : %d" , isbn , price , authorName , quantity);

	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(this == obj) {
			return true;
		}
		
		if(!(obj instanceof Book)) {
			return false;
		}
		Book book = (Book) obj;
		return this.isbn.equals(book.isbn);
	}
}
