import java.util.Scanner;
public class Q3 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
int dosa=45;
int samosa=20;
int idli=25;
int chai=12;
int misal=85;
int meduvada=30;
int sabuvada=30;
int momos=70;
int pizza=125;
int coke=35;
int bill=0;
int choice;
	do {
		System.out.println("Enter choice : ");
		System.out.println("0.For exiting .......");
		System.out.println("1.Dosa");
		System.out.println("2.Samosa");
		System.out.println("3.Idli");
		System.out.println("4.Chai");
		System.out.println("5.Misal");
		System.out.println("6.Medu vada");
		System.out.println("7.Sabu vada");
		System.out.println("8.Momos");
		System.out.println("9.Pizza");
		System.out.println("10.Coke");
choice=sc.nextInt();
		
		int qty;
		switch(choice) {
		case 1:
		
			System.out.println("Enter qty  : ");
			qty=sc.nextInt();
			qty*=dosa;
			bill+=qty;
			qty=0;

			break;
			
		case 2:
			System.out.println("Enter qty  : ");
			qty=sc.nextInt();
			qty*=samosa;
			bill+=qty;
			qty=0;
			break;
		case 3:
			System.out.println("Enter qty  : ");
			qty=sc.nextInt();
			qty*=idli;
			bill+=qty;
			qty=0;
			break;
			
		case 4:
			System.out.println("Enter qty  : ");
			qty=sc.nextInt();
			qty*=chai;
			bill+=qty;
			qty=0;
			break;
		case 5:

			System.out.println("Enter qty  : ");
			qty=sc.nextInt();
			qty*=misal;
			bill+=qty;
			qty=0;
			break;
		case 6:

			System.out.println("Enter qty  : ");
			qty=sc.nextInt();
			qty*=meduvada;
			bill+=qty;
			qty=0;
			break;
		case 7:

			System.out.println("Enter qty  : ");
			qty=sc.nextInt();
			qty*=sabuvada;
			bill+=qty;
			qty=0;
			break;
		case 8:

			System.out.println("Enter qty  : ");
			qty=sc.nextInt();
			qty*=momos;
			bill+=qty;
			qty=0;
			break;
			
		case 9:

			System.out.println("Enter qty  : ");
			qty=sc.nextInt();
			qty*=pizza;
			bill+=qty;
			qty=0;
			break;
		case 10:

			System.out.println("Enter qty  : ");
			qty=sc.nextInt();
			qty*=coke;
			bill+=qty;
			qty=0;
			break;
			
		}
		
	}while(choice!=0);
	
	System.out.println("Total Bill : "+bill);
	
	

}

}
