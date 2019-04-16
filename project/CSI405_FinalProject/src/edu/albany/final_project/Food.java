package edu.albany.final_project;

public class Food extends Element // Extend Element class
{
	private Element food;
	private int size;
	
	public Food(int size) // Constructor
	{
		super(size);
		this.size = size;
		this.food = new Element(size);
	}
	
	@Override
	public void setElement() // Method for setting food
	{
		int x = (int)(Math.random()*(Setting.WIDTH-size));
		int y = (int)(Math.random()*(Setting.HEIGHT-size));
		x = x - (x % size);
		y = y - (y % size);
		this.food.setPosition(x, y);
	}
	
	@Override
	public Element getElement() // Method for getting food
	{
		return this.food;
	}
}
