//Name: Sangheon Lee
//Student ID Numbers: #001286825
import java.util.Scanner;

public class Bank {

	private String name;
	private Address a; 
	
	public Bank() //Constructor of Bank class. Set bank's name to null initially.
	{
		this.name = null;
		this.a = new Address(); //Instance of Address class.
	}
	
	public void setName(String n) //Set method for bank's name.
	{
		name = n;
	}
	
	public String getName() //Get method for bank's name.
	{
		return name;
	}
	
	public void setAddress(String l1, String l2, String s, String c, String z) //Set method for instance variable of Address class.
	{
		a.setLine1(l1);
		a.setLine2(l2);
		a.setSate(s);
		a.setCity(c);
		a.setZip(z);
	}
	
	public String getAddress() //Get method for instance variable of Address class.
	{
		return a.getLine1() + ", " + a.getLine2() + ", " + a.getState() + ", " + a.getCity() + ", " + a.getZip();
	}
	
	public static void main(String[] args){
		
		String option;
		
		Person me = new Person(); //Instance of Person class.
		Bank bank = new Bank(); //Instance of Bank class.
		
		Scanner keyboard = new Scanner(System.in);
		
		//Set Bank's name and address.
		bank.setName("Bank of America");
		bank.setAddress("1450WesternAve", "...", "NewYork", "Albany", "12203");
		System.out.println("<< Welcome to " + bank.getName() + "! >>");
		
		System.out.println("What is your fisrt name?"); //Prompt the user to enter first name, and then set first name.
		me.setFirstName(keyboard.next());
		
		System.out.println("What is your last name?"); //Prompt the user to enter last name, and then set last name.
		me.setLastName(keyboard.next());
		
		//Prompt the user to enter address, and then set address.
		System.out.println("Type your address(Enter line1, line2, state, city, Zip in regular sequence and do not use white space characters for separation. Use uppercase characters for separation)");
		me.setAddress(keyboard.next(), keyboard.next(), keyboard.next(), keyboard.next(), keyboard.next());
		
		do
		{
		//Prompt the user to select an option.
		System.out.println("What kind of work do you want? Enter one of options(checkBalance, withdraw, deposit, exit).");
		option = keyboard.next();
		
		if(option.equals("checkBalance")) //If the user selects checkBalance, display current balance.
		{
			System.out.println("Current Balance: $" + me.getBalance());
			System.out.println();
		}
		
		if(option.equals("withdraw")) //If the user selects withdraw, display receipt after withdrawing.
		{
			//Prompt the user to enter the amount which will be withdrawn.
			System.out.println("Enter the amount which you want to withdraw from your account.");
			me.setBalance(0, keyboard.nextInt());
			
			System.out.println("-------------Receipt-------------");
			System.out.println();
			System.out.println("<Customer Information>");
			System.out.println("Name: " + me.getFirstName() + " " + me.getLastName());
			System.out.println("Address: " + me.address());
			System.out.println();
			System.out.println("<Bank Information>");
			System.out.println("Name: " + bank.getName());
			System.out.println("Address: " + bank.getAddress());
			System.out.println();
			System.out.println("<Customer's Current Balance>");
			System.out.println("Current Balance: " + "$" + me.getBalance());
			System.out.println();
		}
		
		if(option.equals("deposit")) //If the user selects deposit, display receipt after depositing.
		{
			//Prompt the user to enter the amount which will be deposited.
			System.out.println("Enter the amount whcih you want to deposit into your account.");
			me.setBalance(keyboard.nextInt(), 0);
			
			System.out.println("-------------Receipt-------------");
			System.out.println();
			System.out.println("<Customer Information>");
			System.out.println("Name: " + me.getFirstName() + " " + me.getLastName());
			System.out.println("Address: " + me.address());
			System.out.println();
			System.out.println("<Bank Information>");
			System.out.println("Name: " + bank.getName());
			System.out.println("Address: " + bank.getAddress());
			System.out.println();
			System.out.println("<Customer's Current Balance>");
			System.out.println("Current Balance: " + "$" + me.getBalance());
			System.out.println();
		}
		
		}while(option.compareTo("exit") != 0); //If the user selects exit, close the program.
		
	}
}
