import java.util.Scanner;
public class Date {
	private int day;
	private int month;
	private int year;
Scanner sc=new Scanner(System.in);
public Date(int day,int month,int year) {
	this.day=day;
	this.month=month;
	this.year=year;
}

public void setDay(int day) {
	this.day=day;
}

public void setMonth(int month) {
	this.month=month;
}

public void setYear(int year) {
	this.year=year;
}
	
public int getDay() {
	return day;
}
public int getMonth() {
	return month;
}
public int getYear() {
	return year;
}

public void showDate() {
	System.out.println(year+"/"+month+"/"+day);
}

}

class DateTest{
	public static void main(String [] args) {
		Date dt1=new Date(2004,8,12);
		Date dt2=new Date(2001,1,7);
		
		dt1.showDate();
		dt2.showDate();
		
		dt1.setDay(25);
		dt1.setYear(2000);
		
		dt1.showDate();
		dt2.showDate();
		
	}
}