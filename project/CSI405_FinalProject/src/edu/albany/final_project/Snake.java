package edu.albany.final_project;

import java.util.ArrayList;

public class Snake extends Element
{
	private Element head;
	private ArrayList<Element> snake;
	private int size;
	
	public Snake(int size) // Constructor
	{
		super(size);
		this.size = size;
	}
	
	public void setSnake() // Method for setting snake
	{
		this.head = new Element(size);
		this.snake = new ArrayList<Element>();
		this.head.setPosition(Setting.WIDTH/2, Setting.HEIGHT/2);
		this.snake.add(this.head);
		for(int i = 1; i < 2; i++)
		{
			Element e = new Element(this.size);
			e.setPosition(this.head.getX() + (i*size), this.head.getY());
			this.snake.add(e);
		}
	}
	
	public Element getHead() // Method for getting head
	{
		return this.head;
	}
	
	public ArrayList<Element> getSnake() // Method for getting snake
	{
		return this.snake;
	}
}
