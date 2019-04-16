package edu.albany.cruise;

import edu.albany.ship.Ship; // Import package for Ship class

public class CruiseShip extends Ship // Extends Ship class
{
	private int passengers;
	
	public CruiseShip() // Constructor
	{
		super(); // Call super class
		this.passengers = 0;
	}

	public void setName(String name) // Method for set name
	{
		this.name = name;
	}
	
	public void setYear(String year) // Method for set year
	{
		this.year = year;
	}
	
	public void setPassengers(int p) // Method for set passengers
	{
		this.passengers = p;
	}
	
	public String getName() // Method for get name
	{
		return this.name;
	}
	
	public String getYear() // Method for get year
	{
		return this.year;
	}
	
	public int getPassengers() // Method for get passengers
	{
		return this.passengers;
	}
	
	@Override
	public String toString() // Override toString method
	{
		return "Ship's name: " + this.name + " | The maximum number of passengers: " + this.passengers;
	}
}
