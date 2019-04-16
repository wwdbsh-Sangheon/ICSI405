package edu.albany.people;

// Cashier
public class Rachel
{
	private int totalA;
	private int price;
	private Micheal m;
	
	public Rachel(Micheal m) // Constructor
	{
		this.totalA = 0;
		this.price = 10;
		this.m = m;
	}
	
	public void setTheGoalForMoneyToEarn() // Method for set totalA
	{
		this.totalA = m.getGoal() * price;
	}
	
	public void setTheAmountOfMoneyUptoGoal() // Method for set changed totalA
	{
		this.totalA -= (m.getNumToMake() * price);
	}
	
	public int getTheAmountOfMoneyUptoGoal() // Method for get totalA
	{
		return this.totalA;
	}
}
