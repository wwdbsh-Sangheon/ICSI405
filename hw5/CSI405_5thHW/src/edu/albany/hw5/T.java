package edu.albany.hw5;

import java.io.FileNotFoundException;
import java.io.IOException;

public class T extends Grep
{
	private Grep t; // Object which current thread will wait for
	
	public T(String[] argument, Grep t) throws FileNotFoundException // Constructor
	{
		super(argument);
		this.t = t;
	}
	
	@Override
	public void run() // Method for executing thread
	{
		try
		{
			if(this.t != null) this.t.join(); // Condition: t is not null. Thread will wait for previous thread.
			this.startTime = System.nanoTime(); // Starting time
			findPattern(); // Call static method.
			this.runningTime = System.nanoTime() - this.startTime; // Running time
		}
		catch(IOException e) // IOException
		{
			e.printStackTrace();
		}
		catch (InterruptedException e) //InterruptedException
		{	
			e.printStackTrace();
		}
	}
}