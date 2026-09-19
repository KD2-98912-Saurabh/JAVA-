import java.util.Scanner;
public class CreditLimitCalculator {
public static void main(String [] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter account number : ");
	int accNumber=sc.nextInt();
	while(accNumber!=0) {
		System.out.println("Enter Balance at the begining of month:  ");
		int balance=sc.nextInt();
		System.out.println("Enter Charged amt : ");
		int charges=sc.nextInt();
		System.out.println("Enter total credits : ");
		int totalCredits=sc.nextInt();
		System.out.println("Enter Credit limit : ");
		int creditLimit=sc.nextInt();
		
		int newBalance=balance+charges-totalCredits;
		System.out.printf("Account number : %d%n",accNumber);
		System.out.printf("New Balance : %d%n",newBalance);
		
		if(newBalance>creditLimit) {
			System.out.println("Credit limit exceeded");
			
		}
		
		System.out.println("Enter account number : ");
		accNumber=sc.nextInt();
		
	}
}
}
