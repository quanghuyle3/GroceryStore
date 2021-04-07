package groceryStore;

public class RetailItem 
{
	private String name;
	private double price;
	
	// Contructor
	public RetailItem(String n, double p)
	{
		name = n.toUpperCase();
		price = p;
	}
	
	// Copy constructor
	public RetailItem(RetailItem item)
	{
		name = item.name;
		price = item.price;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	// ToString method return a string represent that item
	public String toString()
	{
		String str = name + ": $" + price;
		return str;
		
	}
}