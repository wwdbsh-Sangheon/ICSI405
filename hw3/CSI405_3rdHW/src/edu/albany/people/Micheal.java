package edu.albany.people;

import java.util.ArrayList; // Import packages
import edu.albany.interfaces4sandwich.Customer;

// Sandwich Maker
public class Micheal
{
	private int goal;
	private int num;
	private ArrayList<Customer> Al;
	
	public Micheal(ArrayList<Customer> Al) // Constructor
	{
		this.goal = 0;
		this.num = 0;
		this.Al = Al;
	}
	
	public void setArrayList() // Method for set elements of ArrayList
	{
		this.Al.add(new Steve());
		this.Al.add(new Sarah());
		this.Al.add(new Lee());
		this.Al.add(new Sam());
		this.Al.add(new John());
		this.Al.add(new Amanda());
	}
	
	public void setTheGoalForNumToSell(int num) // Method for set goal
	{
		this.goal = num;
	}
	
	public void setNumToMake(int index) // Method for set num
	{
		this.num = Al.get(index).getNumToBuy();
	}
	
	public void setNumToBuy(int index, int num) // Method for set num
	{
		Al.get(index).setNumToBuy(num);
	}
	
	public ArrayList<Customer> getArrayList() // Method for get ArrayList.
	{
		return this.Al;
	}
	
	public int getGoal() // Method for get goal
	{
		return this.goal;
	}
	
	public int getNumToMake() // Method for get num
	{
		return this.num;
	}
	
	public String getName(int index) // Method for get name of customer
	{
		return Al.get(index).getName();
	}
	
	public int getNumToBuy(int index) // Method for get num
	{
		return Al.get(index).getNumToBuy();
	}
}
