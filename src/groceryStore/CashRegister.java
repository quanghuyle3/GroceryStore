package groceryStore;
import java.util.Scanner;
import java.util.ArrayList;


public class CashRegister 
{
	private double subTotal = 0;
	private int quantity;
	private Scanner keyboard = new Scanner(System.in);
	private double taxRate = 0.06;
	
	// Constructor
	public CashRegister(ArrayList<RetailItem> items)
	
	{
		System.out.println("\nEnter the quantity for each item.");
		for (RetailItem item : items)
		{
			System.out.print(item.getName() + " $" + item.getPrice() + "/unit. Quantity: ");
			quantity = keyboard.nextInt();
			subTotal = subTotal + (item.getPrice() * quantity);
			System.out.println("\t\t\t$" + (item.getPrice() * quantity));
		}
		
	}
	// Get sub-total
	public double getSubTotal()
	{
		return subTotal;
	}
	// Calculate and return Tax
	public double getTax()
	{
		
		return (subTotal * (taxRate));
	}
	
	// Calculate and return thr total have to pay
	public double getTotal()
	{
		return subTotal + getTax();
	}
}

