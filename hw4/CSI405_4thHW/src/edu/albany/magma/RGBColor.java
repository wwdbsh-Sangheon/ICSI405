package edu.albany.magma;

public class RGBColor extends Semigroup<Integer> implements Complementable<RGBColor> // Extends Semigroup<T> class and implements Complementable<T> interface
{
	private int color[] = {0, 0, 0}; // Int array for r, g, b
	
	public RGBColor(int r, int g, int b) // Constructor
	{
		this.color[0] = r;
		this.color[1] = g;
		this.color[2] = b;
	}
	
	@Override
	public Integer operation(Integer inputColor, Integer idx) // Method for getting result of operator
	{
		return this.color[idx] = (this.color[idx.intValue()] += inputColor.intValue()) / 2;
	}
	
	@Override
	public RGBColor complementOP() // Method for getting the object about the complement of the former
	{
		return new RGBColor(255-this.color[0], 255-this.color[1], 255-this.color[2]);
	}
	
	@Override
	public String toString() // toString method for getting new color
	{
		return "[" + this.color[0] + "/" + this.color[1] + "/" + this.color[2] + "]";
	}
	
	@Override
	public String toString(RGBColor c) // toString method for getting the complement of the former
	{
		return "[" + c.getColor(0) + "/" + c.getColor(1) + "/" + c.getColor(2) + "]";
	}
	
	public String toString(RGBColor c, int r, int g, int b) // toString method for getting new color
	{
		return "[" + c.operation(r, 0) + "/" + c.operation(g, 1) + "/" + c.operation(b, 2) + "]";
	}
	
	public int getColor(int i) // Method for getting color
	{
		return this.color[i];
	}	
}
