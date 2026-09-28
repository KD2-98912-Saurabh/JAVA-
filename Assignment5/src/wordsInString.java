import java.util.Scanner;
public class wordsInString {
	 public static void main(String[] args) {
		 System.out.println("Enter string");
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine();
		 String[] str2 = str.trim().split(" ");
		 System.out.println(str2.length);
    }
}
