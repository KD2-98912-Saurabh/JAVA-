package com.sunbeam;

import java.util.Scanner;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack stack = null;

        int choice;

        do {

          
            System.out.println("1. Choose Fixed Stack");
            System.out.println("2. Choose Growable Stack");
            System.out.println("3. Push data");
            System.out.println("4. Pop data");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:

                if (stack == null) {
                    stack = new FixedStack();
                    System.out.println("Fixed Stack selected.");
                } else {
                    System.out.println("Stack already selected. Cannot change stack.");
                }

                break;

            case 2:

                if (stack == null) {
                    stack = new GrowableStack();
                    System.out.println("Growable Stack selected.");
                } else {
                    System.out.println("Stack already selected. Cannot change stack.");
                }

                break;

            case 3:

                if (stack == null) {
                    System.out.println("NO stack chosen !!!");
                } else {

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.next();

                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();

                    Employee emp = new Employee(id, name, salary);

                    stack.push(emp);
                }

                break;

            case 4:

                if (stack == null) {
                    System.out.println("NO stack chosen !!!");
                } else {

                    Employee emp = stack.pop();

                    if (emp != null) {
                        System.out.println("Popped Employee:");
                        System.out.println(emp);
                    }
                }

                break;

            case 5:

              
                break;

            default:

                System.out.println("Invalid choice !!!");
            }

        } while (choice != 5);

       
    }
}