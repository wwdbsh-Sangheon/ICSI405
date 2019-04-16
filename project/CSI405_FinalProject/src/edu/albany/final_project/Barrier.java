package edu.albany.final_project;

public class Barrier extends Element // Extend Element class
{
	private Element barrier;
	private int size;
	
	public Barrier(int size) // Constructor
	{
		super(size);
		this.size = size;
	}
	
	@Override
	public void setElement() // Method for setting Barrier
	{
		this.barrier = new Element(size);
		int x = (int)(Math.random()*(Setting.WIDTH-size));
		int y = (int)(Math.random()*(Setting.HEIGHT-size));
		x = x - (x % size);
		y = y - (y % size);
		this.barrier.setPosition(x, y);
	}
	
	@Override
	public Element getElement() // Method for getting barrier
	{
		return this.barrier;
	}
}
