package edu.albany.sandwich;

import java.util.Scanner; // Import packages
import java.util.ArrayList;
import edu.albany.interfaces4sandwich.Customer;
import edu.albany.people.*;

public class SandwichDriver {

	public static void main(String[] args) {
		
		int price = 10, i; // Declaring int variables
		
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Customer> Al = new ArrayList<>(); // Initializing ArrayList
		Micheal maker = new Micheal(Al); // Initializing instances of both maker and cashier
		Rachel cashier = new Rachel(maker);
		
		maker.setArrayList(); // Set ArrayList
		maker.getArrayList(); // get ArrayList
		
		System.out.println("How many sandwiches do you decide to sell today?");
		maker.setTheGoalForNumToSell(keyboard.nextInt()); // Set the goal
		cashier.setTheGoalForMoneyToEarn(); // Set the goal of monegy
		System.out.println("Today's goal for the number of sandwiches to sell: " + maker.getGoal());
		System.out.println("Today's goal for money to earn: " + "$" + cashier.getTheAmountOfMoneyUptoGoal());
		
		for(i = 0; i < Al.size(); i++)
		{
			System.out.println("=======================================================================");
			System.out.println("<<Welcome to UAlbany Sandwich Shop>>");
			System.out.print("Rachel: Hi! How many sandwiches do you want? ");
			maker.setNumToBuy(i, keyboard.nextInt()); // Prompt the user to enter num to buy
			maker.setNumToMake(i);
			cashier.setTheAmountOfMoneyUptoGoal();
			System.out.println(maker.getName(i) + ": " + maker.getNumToBuy(i) + " please.");
			System.out.println("Rachel: Here you are. Thanks. Hava a nice day!");
			System.out.println("The amount of money upto goal: $" + cashier.getTheAmountOfMoneyUptoGoal());
			
		}
		
		System.out.println();
		
		if(cashier.getTheAmountOfMoneyUptoGoal() > 0) // Condition: Earn money less than goal
		{
			System.out.println("Got loss about $" + cashier.getTheAmountOfMoneyUptoGoal());
		}
		else if(cashier.getTheAmountOfMoneyUptoGoal() < 0) // Condition: Earn money more than goal
		{
			System.out.println("Got surplus about $" + (cashier.getTheAmountOfMoneyUptoGoal()*(-1)) + " more than goal.");
		}
		else
		{
			System.out.println("Accomplished goal.");
		}
	}

}
