package edu.albany.magma;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Semigroup<T> // Abstract class which can get any data type
{	
	public abstract T operation(T inputNum, T idx); // Abstract method for getting value which has data type T
	
	public static <T> T combine(Collection<T> list) // Static method for printing out all elements of list.
	{
		for(T s : list) // Enhanced for loop for getting each s
			System.out.println(s.toString());
		
		return null;
	}
	
	public static void main(String[] args) {
		
		BinaryWord bw = new BinaryWord("001011"); // Instance variable from BinaryWord class
		bw.setBits();
		System.out.println("<BinaryWord class>");
		System.out.print(bw.toString(bw.complementOP()));
		System.out.println();
		 
		PositiveInteger pi = new PositiveInteger(100); // Instance variables from PositiveInteger class 
		System.out.println("<PositiveInteger class>");
		System.out.println(pi.operation(300, 0));
		PositiveInteger pi2 = new PositiveInteger(300);
		System.out.println("<PositiveInteger class>");
		System.out.println(pi2.operation(500, 0));
		PositiveInteger pi3 = new PositiveInteger(400);
		System.out.println("<PositiveInteger class>");
		System.out.println(pi3.operation(1000, 0));
		PositiveInteger pi4 = new PositiveInteger(200);
		System.out.println("<PositiveInteger class>");
		System.out.println(pi4.operation(800, 0));
		System.out.println();
		
		RGBColor rgb = new RGBColor(32, 96, 128); // Instance variables from RGBColor class
		System.out.println("<RGBColor class>");
		System.out.println("The complement ot the former: " + rgb.toString(rgb.complementOP()));
		System.out.println("New color: " + rgb.toString(rgb, 0, 99, 255));
		RGBColor rgb2 = new RGBColor(27, 100, 210);
		System.out.println("<RGBColor class>");
		System.out.println("The complement ot the former: " + rgb2.toString(rgb2.complementOP()));
		System.out.println("New color: " + rgb2.toString(rgb2, 56, 90, 120));
		System.out.println();
		
		Collection<Semigroup> al = new ArrayList<Semigroup>(); // Instance variable which has Collection<Semegroup> type from ArrayList<Semigroup>
		al.add(pi); // Add Objects from PositiveInteger class for getting total.
		al.add(pi2);
		al.add(pi3);
		al.add(pi4);
		al.add(rgb); // Add Objects from RGBColor class for accumulating each result.
		al.add(rgb2);
		System.out.println("<Combine>");
		Semigroup.combine(al); // Call static method
	}
}
