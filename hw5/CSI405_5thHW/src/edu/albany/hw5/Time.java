package edu.albany.hw5;
// I succeeded to execute threads more than 6000 threads on this program.
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;

public class Time
{
	public static void main(String[] args) throws IOException, InterruptedException
	{	
		Grep lastT = null; // Variable for last element of list
		long user = 0, sys = 0, real = 0; // Variables for duration
		ThreadMXBean b = ManagementFactory.getThreadMXBean(); // Variable for measuring duration
		ArrayList<Grep> al = new ArrayList<Grep>(); // ArrayList
		for(int i = 0; i < 3; i++) // Loop for creating objects
		{
			if(i == 0)
				al.add(new T(args, null));
			else
				al.add(new T(args, al.get(i-1)));
		}
		
		if(args[0].compareTo("LC_ALL=C") == 0 && args[1].compareTo("time") == 0 && args[2].compareTo("grep") == 0 && args[3].compareTo("-n") == 0) // Argument condition
		{
			for(Grep t: al) // Loop for running all threads
			{
				t.start();
				lastT = t;
			}
			lastT.join(); // Waiting last thread.
			
			for(Grep t : al) // Loop for getting duration
			{
				user += b.getThreadUserTime(t.getThreadId());
				sys += b.getThreadCpuTime(t.getThreadId());
				real += t.getRunningTime();
			}
			sys -= user;
			System.out.println(String.format("real: %.2f", real/(double)1000000000));
			System.out.println(String.format("user: %.2f", user/(double)1000000000));
			System.out.println(String.format("sys: %.2f", sys/(double)1000000000));
		}
		else
		{
			System.out.println("Usage: LC_ALL='C' time grep -n 'word to find' /path/to/file/abc.txt"); // Error message
		}
	}
}