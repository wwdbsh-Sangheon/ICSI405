package edu.albany.final_project;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Element
{
	private int x, y, size;
	
	public Element(int size) // Constructor
	{
		this.size = size;
	}
	
	public int getX() // Method for getting x
	{
		return x;
	}
	
	public int getY() // Method for getting y
	{
		return y;
	}
	
	public void setX(int x) // Method for setting x
	{
		this.x = x;
	}
	
	public void setY(int y) // Method for setting y
	{
		this.y = y;
	}
	
	public void setPosition(int x, int y) // Method for setting position
	{
		this.x = x;
		this.y = y;
	}
	
	public void move(int dx, int dy) // Method for moving object
	{
		x += dx;
		y += dy;
	}
	
	public Rectangle getBound() // Method for getting bound
	{
		return new Rectangle(x, y, size, size);
	}
	
	public boolean isCollision(Element o) // Method for collision
	{
		if(o == this) return false;
		return getBound().intersects(o.getBound());
	}
	
	public void render(Graphics2D g2d) // Method for rendering
	{
		g2d.fillRect(x + 1, y + 1, size - 2, size - 2);
	}

	public void setElement(){} // Method for setting element
	public Element getElement(){return null;} // Method for getting Element
}
