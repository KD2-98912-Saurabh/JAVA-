package com.sunbeam;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Program {
	public static ArrayList<Book> arr = new ArrayList<>();
	public static Scanner scanner=new Scanner(System.in);
	public static Book[] getIntance() {
		Book arr[] = new Book[5];
		arr[0] = new Book("2123" , 2300.4 , "Aman" , 4);
		arr[1] = new Book("3234" , 4300.4 , "Pawan" , 5);
		arr[2] = new Book("2243" , 5300.4 , "Sahu" , 10);
		arr[3] = new Book("435" , 200.4 , "Dhruv" , 9);
		arr[4] = new Book("2123" , 4300.4 , "Sahil" , 22);
		return arr;
	}
	
	public static void addBook(Book book[]) {
		for(Book book2 : book) {
			arr.add(book2);
		}
	}
	
	public static void forwordOrder() {
		ListIterator<Book> trav = arr.listIterator();
		while(trav.hasNext()) {
			Book b1 = trav.next();
			System.out.println(b1.toString());
		}
	}
	
	public static void reverseOrder() {
		ListIterator<Book> trav = arr.listIterator(arr.size());
		while(trav.hasPrevious()) {
			Book b2 = trav.previous();
			System.out.println(b2.toString());
		}
	}
	
	public static void deleteBookAtIndex(int idx) {
		if(idx < arr.size()) {
			arr.remove(idx);
			System.out.println("Book is Deleted");
		}else {
			System.out.println("Invalid Index");
		}
	}
	
	public static void SearchBookByIsbn() {
		System.out.println("Enter Isbn : ");
		String num = scanner.next();
		
		Book keyBook = new Book();
		keyBook.setIsbn(num);
		
		if(arr.contains(keyBook)) {
			int kBook = arr.indexOf(keyBook);
			if(kBook != -1) {
				Book book = arr.get(kBook);
				System.out.println(book.toString());
			}else {
				System.out.println("Not Found");
			}
		}else {
			System.out.println("Invalid Isbn");
		}
		
	}
	
	public static void printArray() {
		for(Book book : arr) {
			System.out.println(book.toString());
		}
	}
	
	public static int menuList() {
		int choice;
		System.out.println("0.Exit");
		System.out.println("1. Add new Books");
		System.out.println("2. Display all books in forword Order");
		System.out.println("3. Display all books in reverse Order");
		System.out.println("4. Delete a book at given Index");
		System.out.println("5. Sort all books by price in Desc");
		System.out.println("6. Search a book based on Isbn");
		System.out.println("7. Display Books");
		System.out.println("Select a choice from above :");
		choice = scanner.nextInt();
		return choice;
	}
	
	public static int acceptIndex(int idx) {
		System.out.println("Enter index : ");
		idx = scanner.nextInt();
		return idx;
	}
	
	public static void main(String[] args) {
		int choice;
		int idx = 0;
		while((choice = menuList())!=0) {
			switch (choice) {
			case 1:
				arr.clear();
				Book book[] = Program.getIntance();
				Program.addBook(book);
				Program.printArray();
				break;
			case 2:
				Program.forwordOrder();
				break;
			case 3:
				Program.reverseOrder();
				break;
			case 4:
				idx = Program.acceptIndex(idx);
				Program.deleteBookAtIndex(idx);
				break;
			case 5:
				arr.sort(new CompareByPrice());
				break;
			case 6:
				Program.SearchBookByIsbn();
				break;
			case 7:
				Program.printArray();
				break;
			}
		}
	}
}
