package Tester;
import com.app.geometry.*;
import java.util.Scanner;
public class TestPoint {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter x1 co-ordinate of first point : ");
	int x1=sc.nextInt();
	System.out.println("Enter y1 co-ordinate of first point : ");
	int y1=sc.nextInt();
	
	
	System.out.println("Enter x2 co-ordinate of secend point : ");
	int x2=sc.nextInt();
	System.out.println("Enter y2 co-ordinate of second point : ");
	int y2=sc.nextInt();
	
	
Point2D p1=new Point2D(x1,y1);
Point2D p2=new Point2D(x2,y2);

System.out.println("First Point : "+p1.getDetails());
System.out.println("Second Point : "+p2.getDetails());

if(p1.isEquals(p2)) {
	System.out.println("Both points are located at same position ");
}
else {
	System.out.println("Both points are not located at same positon ");
	System.out.println("Difference between Two points is : "+p1.calculateDistance(p2));
	
}
}
}
