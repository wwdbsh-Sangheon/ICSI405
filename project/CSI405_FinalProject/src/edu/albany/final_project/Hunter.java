package edu.albany.final_project;

public class Hunter extends Element // extend Element class
{
	private Element hunter;
	private int size;
	
	public Hunter(int size) // Constructor
	{
		super(size);
		this.size = size;
		this.hunter = new Element(size);
	}
	
	public void setElement() // Method for setting hunter
	{
		int x = (int)(Math.random()*(Setting.WIDTH-size));
		int y = (int)(Math.random()*(Setting.HEIGHT-size));
		x = x - (x % size);
		y = y - (y % size);
		this.hunter.setPosition(x, y);
	}
	
	public Element getElement() // Method for getting hunter
	{
		return this.hunter;
	}
}
