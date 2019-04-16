package edu.albany.people;

import edu.albany.interfaces4sandwich.Customer; // Import package for interface
// Customer
public class Steve implements Customer // Implements Customer which is interface
{
	private String name;
	private int num;
	
	public Steve() // Constructor
	{
		this.name = "Steve";
		this.num = 0;
	}
	
	public void setNumToBuy(int num) // Method for set num
	{
		this.num = num;
	}
	
	public int getNumToBuy() // Method for get num
	{
		return this.num;
	}
	
	public String getName() // Method for get name
	{
		return this.name;
	}
}
