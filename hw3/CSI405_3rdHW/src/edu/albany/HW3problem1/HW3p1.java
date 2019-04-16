package edu.albany.HW3problem1;

import java.util.ArrayList; // Import packages
import edu.albany.cargo.*;
import edu.albany.cruise.*;
import edu.albany.ship.Ship;

public class HW3p1 {

	public static void main(String[] args) {

		ArrayList<Ship> Al = new ArrayList<>(); // Making ArrayList which has data type of Ship
		
		CruiseShip s1 = new CruiseShip(); // Making instances of ships
		CruiseShip2 s2 = new CruiseShip2();
		CargoShip s3 = new CargoShip();
		CargoShip2 s4 = new CargoShip2();
		
		s1.setName("Black Pearl"); // Set their name, year, passengers, and capacity
		s1.setYear("893");
		s1.setPassengers(2000);
		s2.setName("Merry Jane");
		s2.setYear("875");
		s2.setPassengers(500);
		s3.setName("Flying Dutchman");
		s3.setYear("900");
		s3.setCapacity(10000);
		s4.setName("SeJong");
		s4.setYear("2007");
		s4.setCapacity(50000);
		
		Al.add(s1); // Add them to ArrayList
		Al.add(s2);
		Al.add(s3);
		Al.add(s4);
		
		for(Ship s : Al) // Enhanced loop for getting element of Al.
		{
			System.out.println(s.toString(s)); // Call toString method which is in Ship class
			System.out.println(s); // Call toString method which is in its own class.
			System.out.println();
		}
	}

}
