package edu.albany.magma;

public class PositiveInteger extends Semigroup<Integer> // Extends Semigroup<T> class
{
	private static int num = 0; // Static int variable for total num
	private int num2 = 0;
	
	public PositiveInteger(int num) // Constructor
	{
		this.num2 = num;
	}
	
	@Override
	public Integer operation(Integer inputNum, Integer nothing) // Method for getting result of operator
	{	
		return this.num2 += inputNum.intValue();
	}
	
	@Override
	public String toString() // toString method for getting total num
	{
		this.num += this.num2;
		
		return String.valueOf(this.num);
	}
}
