package groceryStore;

import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;


public class StoreDemo 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int input;
		// An array list contains all items sale in store
		ArrayList<RetailItem> allItems = new ArrayList<>();
		
		// An array list contains all items
		ArrayList<RetailItem> buyItems = new ArrayList<>();
		
		// Inventory instance
		Inventory inv1 = new Inventory();
		// Get all the available items
		allItems = inv1.getInventory();
		
		
		
		// Present all available items at store
		presentItems(allItems);
		
		
		
		// Let the customer add items they want to buy until they've done
		System.out.print("\nSelect the item you want(by number): ");
		input = keyboard.nextInt();
		
		while (input != 9)
		{
			addItem(input, allItems, buyItems);
			System.out.print("Continue selecting next item (by number): ");
			input = keyboard.nextInt();
		}
		
		
		// Create an instance from CashRegister to check out
		CashRegister checkout = new CashRegister(buyItems);
		
		// Display result
		double subTotal = checkout.getSubTotal();
		double tax = checkout.getTax();
		double total = checkout.getTotal();
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("\nSubtotal: $" + df.format(subTotal));
		System.out.println("Tax (9%): $" + df.format(tax));
		System.out.println("TOTAL: $" + df.format(total));
	}
	
	// Present all items/options at store
	public static void presentItems(ArrayList<RetailItem> items)
	{
		// Show all items that store have
		System.out.println("- These are the items on sale at our convenient store -");
		
		for (int i = 0; i < items.size(); i++)
		{
			System.out.println( (i + 1) + ". " + items.get(i));
		}
		// Create exit option
		System.out.println((items.size() + 1) + ". Exit");
		
	}
	
	// Add item customer want to buy to an array list
	public static void addItem(int num, ArrayList<RetailItem> onSale, ArrayList<RetailItem> buy)
	{
		
		switch (num)
		{
		case 1:
		{
			buy.add(onSale.get(0));
			break;
		}
		case 2:
		{
			buy.add(onSale.get(1));
			break;
		}
		case 3:
		{
			buy.add(onSale.get(2));
			break;
		}
		case 4:
		{
			buy.add(onSale.get(3));
			break;
		}
		case 5:
		{
			buy.add(onSale.get(4));
			break;
		}
		case 6:
		{
			buy.add(onSale.get(5));
			break;
		}
		case 7:
		{
			buy.add(onSale.get(6));
			break;
		}
		case 8:
		{
			buy.add(onSale.get(7));
			break;
		}
		}
		
	}
}


