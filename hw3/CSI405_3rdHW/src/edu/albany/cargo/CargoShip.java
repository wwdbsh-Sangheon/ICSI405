import edu.albany.ship.Ship; // Import package for Ship class

public class CargoShip extends Ship // Extends Ship class
{
	private int capacity;
	
	public CargoShip() // Constructor
	{
		super(); // Call super class
		this.capacity = 0;
	}
	
	public void setName(String name) // Method for set name
	{
		this.name = name;
	}
	
	public void setYear(String year) // Method for set year
	{
		this.year = year;
	}
	
	public void setCapacity(int c) // Method for set capacity
	{
		this.capacity = c;
	}
	
	public String getName() // Method for get name
	{
		return this.name;
	}
	
	public String getYear() // Method for get year
	{
		return this.year;
	}
	
	public int getCapacity() // Method for get capacity
	{
		return this.capacity;
	}
	
	@Override
	public String toString() // Override toString method
	{
		return "Ship's name: " + this.name + " | Cargo capacity: " + this.capacity;
	}
}