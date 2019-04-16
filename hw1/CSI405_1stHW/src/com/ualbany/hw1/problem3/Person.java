public class Person {

	private String firstName;
	private String lastName;
	private Address a;  
	private CheckingBankAccount c; 
	
	public Person() //Constructor of Person class. Set firstName and lastName to null initially.
	{
		this.firstName = null;
		this.lastName = null;
		this.a = new Address(); //Instance of Address class.
		this.c = new CheckingBankAccount(); //Instance of CheckingBankAccount.
	}
	
	public void setFirstName(String fN) //Set method for first name.
	{
		this.firstName = fN;
	}
	
	public void setLastName(String lN) //Set method for last name.
	{
		this.lastName = lN;
	}
	
	public String getFirstName() //Get method for first name.
	{
		return firstName;
	}
	
	public String getLastName() //Get method for last name.
	{
		return lastName;
	}
	
	public void setAddress(String l1, String l2, String s, String c, String z) //Set method for instance variables of Address class.
	{
		a.setLine1(l1);
		a.setLine2(l2);
		a.setSate(s);
		a.setCity(c);
		a.setZip(z);
	}
	public String address() //Get method for instance variables for Address class.
	{
		return a.getLine1() + ", " + a.getLine2() + ", " + a.getState() + ", " + a.getCity() + ", " + a.getZip();
	}
	
	public void setBalance(int d, int w) //Set method for instance variables of CheckingBankAccount class.
	{
		c.deposit(d);
		c.withdraw(w);
	}
	
	public int getBalance() //Get method for instance variable of CheckingBankAccount class.
	{
		return c.getCurrentBalance();
	}
}
