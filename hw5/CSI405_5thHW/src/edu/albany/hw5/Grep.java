package edu.albany.hw5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Grep extends Thread
{
	private static ArrayList<BufferedReader> br = new ArrayList<BufferedReader>(); // ArrayList for buffer
	private static String pattern; 
	private static int fileIdx = 5; // Static variable for file index
	private static int listIdx = 0; // Static variable for ArrayList
	private static int bufferIdx = 0; // Static variable for buffer index
	private FileReader fr;
	protected long startTime;
	protected long runningTime;
	private long id; // Variable for thread ID
	
	public Grep(String[] argument) throws FileNotFoundException // Constructor
	{
		this.fr = new FileReader(argument[this.fileIdx]);
		this.br.add(listIdx, new BufferedReader(fr));
		this.id = currentThread().getId();
		this.pattern = argument[4];
		this.fileIdx++;
		this.listIdx++;
	}
	
	public static void findPattern() throws IOException // Method for finding pattern in line
	{
		String str;
		
		for(int num = 1; (str = br.get(bufferIdx).readLine()) != null; num++) // Loop for both storing buffer value into str and printing out output. 
			if(str.matches("(?i).*" + pattern + ".*")) System.out.println(num + ":" + str);
			
		System.out.println();
		bufferIdx++;
	}
	
	public long getThreadId() // Method for getting thread ID
	{
		return this.id;
	}
	
	public long getRunningTime() // Method for getting running time
	{
		return this.runningTime;
	}
}