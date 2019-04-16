package edu.albany.people;

import edu.albany.interfaces4sandwich.Customer;
// Customer
public class John implements Customer
{
	private String name;
	private int num;
	
	public John()
	{
		this.name = "John";
		this.num = 0;
	}
	
	public void setNumToBuy(int num)
	{
		this.num = num;
	}
	
	public int getNumToBuy()
	{
		return this.num;
	}
	
	public String getName()
	{
		return this.name;
	}
}
