package com.app.fruit;
import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		{
		   
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter basket size: ");
		        int size = sc.nextInt();
		        Fruit[] basket = new Fruit[size];
		        int counter = 0;

		        boolean exit = false;
		        while (!exit) {
		            System.out.println("\nOptions:");
		            System.out.println("0. Exit");
		            System.out.println("1. Add Mango");
		            System.out.println("2. Add Orange");
		            System.out.println("3. Add Apple");
		            System.out.println("4. Display names of all fruits");
		            System.out.println("5. Display details of fresh fruits");
		            System.out.println("6. Display tastes of stale fruits");
		            System.out.println("7. Mark a fruit as stale (by index)");
		            System.out.println("8. Mark all sour fruits stale");

		            int choice = sc.nextInt();
		            switch (choice) {
		                case 0: exit = true; break;

		                case 1:
		                    if (counter < size) {
		                        System.out.print("Enter name, weight, color: ");
		                        String nm = sc.next();
		                        double wt = sc.nextDouble();
		                        String clr = sc.next();
		                        basket[counter++] = new Mango(nm, wt, clr);
		                    } else System.out.println("Basket full!");
		                    break;

		                case 2:
		                    if (counter < size) {
		                        System.out.print("Enter name, weight, color: ");
		                        String nm = sc.next();
		                        double wt = sc.nextDouble();
		                        String clr = sc.next();
		                        basket[counter++] = new Orange(nm, wt, clr);
		                    } else System.out.println("Basket full!");
		                    break;

		                case 3:
		                    if (counter < size) {
		                        System.out.print("Enter name, weight, color: ");
		                        String nm = sc.next();
		                        double wt = sc.nextDouble();
		                        String clr = sc.next();
		                        basket[counter++] = new Apple(nm, wt, clr);
		                    } else System.out.println("Basket full!");
		                    break;

		                case 4:
		                    for (Fruit f : basket) {
		                        if (f != null) System.out.println(f.getName());
		                    }
		                    break;

		                case 5:
		                    for (Fruit f : basket) {
		                        if (f != null && f.isFresh()) {
		                            System.out.println(f.toString() + ", Taste: " + f.taste());
		                        }
		                    }
		                    break;

		                case 6:
		                    for (Fruit f : basket) {
		                        if (f != null && !f.isFresh()) {
		                            System.out.println(f.getName() + " taste: " + f.taste());
		                        }
		                    }
		                    break;

		                case 7:
		                    System.out.print("Enter index to mark stale: ");
		                    int idx = sc.nextInt();
		                    if (idx >= 0 && idx < counter && basket[idx] != null) {
		                        basket[idx].setFresh(false);
		                        System.out.println("Marked " + basket[idx].getName() + " as stale.");
		                    } else {
		                        System.out.println("Invalid index!");
		                    }
		                    break;

		                case 8:
		                    for (Fruit f : basket) {
		                        if (f != null && f.taste().equals("sour")) {
		                            f.setFresh(false);
		                            System.out.println(f.getName() + " marked stale.");
		                        }
		                    }
		                    break;

		                default: System.out.println("Invalid choice!");
		            }
		        }
		        
		    }
		}

	}


