package groceryStore;
import java.util.ArrayList;

public class Inventory 
{
	private ArrayList<RetailItem> avaItems = new ArrayList<>();
	private ArrayList<RetailItem> avaItems_copy = new ArrayList<>();
	
	// contructor
	public Inventory()
	{
		// Create instance from RetailItem class to represent item
		RetailItem item1 = new RetailItem("banana", 0.98);
		avaItems.add(item1); /////////////// Perform deep copy when adding 
		RetailItem item2 = new RetailItem("apple", 1.02);
		avaItems.add(item2);
		RetailItem item3 = new RetailItem("Hot_Cheetos", 2.98);
		avaItems.add(item3);
		RetailItem item4 = new RetailItem("Pen", 1.50);
		avaItems.add(item4);
		RetailItem item5 = new RetailItem("Notebook", 3.98);
		avaItems.add(item5);
		RetailItem item6 = new RetailItem("Chocolate_bar", 1.98);
		avaItems.add(item6);
		
		RetailItem item7 = new RetailItem("Beef_Jerky", 4.00);
		avaItems.add(item7);
		RetailItem item8 = new RetailItem("IceCream_box", 4.98);
		avaItems.add(item8);
	}
	
	// Get the inventory 
	public ArrayList<RetailItem> getInventory()
	{
		
		for (RetailItem item: avaItems)
		{
			avaItems_copy.add(new RetailItem(item));
		}
		return avaItems_copy;
	}

}
