
import java.util.Scanner;

public class Q2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter values : ");

        System.out.println("D1");

        if (sc.hasNextDouble()) {
            double d1 = sc.nextDouble();

            System.out.println("Enter d2 : ");

            if (sc.hasNextDouble()) {
                double d2 = sc.nextDouble();

                double avgValue = (d1 + d2) / 2;

                System.out.println("avgvalue is : " + avgValue);
            } else {
                System.out.println("Error: D2 is not a double.");
            }

        } else {
            System.out.println("Error: D1 is not a double.");
        }

       
    }
}