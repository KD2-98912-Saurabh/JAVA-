import java.util.Scanner;

class Invoice{
	
	private String partNumber;
	private String partDescription;
	private int itemQuantity;
	private double itemPrice;
	
	Scanner sc=new Scanner(System.in);
	public Invoice(String partNumber,String partDescription,int itemQuantity,double itemPrice) {
		this.partNumber=partNumber;
		this.partDescription=partDescription;
		setItemQuantity(itemQuantity);
		setItemPrice(itemPrice);
	}

	public void setPartNumber(String partNumber) {
		this.partNumber=partNumber;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription=partDescription;
	}
	
	public void setItemQuantity(int itemQuantity) {
	    this.itemQuantity = itemQuantity > 0 ? itemQuantity : 0;
	}
	
	public void setItemPrice(double itemPrice) {
		 this.itemPrice= itemPrice > 0.0 ? itemPrice : 0.0;
	}
	
	public String getPartNumber() {
		return partNumber;
	}
	public String getPartDescription() {
		return partDescription;
		
	}
	
	public double getItemPrice() {
		return itemPrice;
	}
	
	public int getItemQuantity() {
		return itemQuantity;
}
	
	public double  getInvoiceAmount() {
		return itemPrice*itemQuantity;
	}
}

public class InvoicetTest {
public static void main(String [] args) {
Invoice	invoice=new Invoice(
			"A351",
			"Hammer",
			3,
			500
			);
System.out.println("Part number : " + invoice.getPartNumber());
System.out.println("Part Description : " + invoice.getPartDescription());
System.out.println("Item Quantity : " + invoice.getItemQuantity());
System.out.println("Item price : " + invoice.getItemPrice());
System.out.println("Total invoice : " + invoice.getInvoiceAmount());

invoice.setItemPrice(-20);
invoice.setItemQuantity(-500);
System.out.println("After Invalid input............");
			
			
System.out.println("Part number : " + invoice.getPartNumber());
System.out.println("Part Description : " + invoice.getPartDescription());
System.out.println("Item Quantity : " + invoice.getItemQuantity());
System.out.println("Item price : " + invoice.getItemPrice());
System.out.println("Total invoice : " + invoice.getInvoiceAmount());

}
}

