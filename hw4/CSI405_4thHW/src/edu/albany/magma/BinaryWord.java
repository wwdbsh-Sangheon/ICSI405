package edu.albany.magma;

import java.util.BitSet;

public class BinaryWord implements Complementable<BitSet> // Implements Complementable<T> interface
{
	private String word; // Field of String word
	private BitSet bits; // Field of BitSet bits
	
	public BinaryWord(String word) // Constructor
	{
		this.word = word;
		this.bits = new BitSet(word.length()); // Initializing instance variable from BitSet which has word's length as a parameter.
	}
	
	public void setBits() // Method for setting bits
	{
		for(int i = 0; i < this.word.length(); i++)
		{	
			if(this.word.charAt(i) == '1') // Condition: i'th char is same as '1'.
			{
				this.bits.set(i);
			}
			else
			{
				this.bits.clear(i);
			}
		}
	}
	
	@Override
	public BitSet complementOP() // Method for getting BitSet object.
	{	
		this.bits.flip(0, this.word.length()); // Flip 0 to last.
		
		return this.bits; // Return object.
	}
	
	@Override
	public String toString(BitSet b) // toString method for printing out bits.
	{
		for(int i = 0; i < this.word.length(); i++)
		{
			System.out.print(bits.get(i) ? 1 : 0);
		}
		
		return "\n";
	}
}
