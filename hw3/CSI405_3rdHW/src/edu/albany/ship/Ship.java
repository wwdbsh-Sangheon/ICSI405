package edu.albany.ship; // Package for abstract class Ship

public abstract class Ship
{
	protected String name; // Declaring protected String variables.
	protected String year;

	public abstract void setName(String name); // Method for set name
	public abstract void setYear(String year); // Method for set year
	public abstract String getName(); // Method for get name
	public abstract String getYear(); // Method for get year
	
	public Ship() // Constructor
	{
		this.name = null;
		this.year = null;
	}
	
	public String toString(Ship s) // toString method which has s as a parameter
	{
		return "Ship's name: " + s.getName() + " | The year it was built: " + s.getYear();
	}
}
