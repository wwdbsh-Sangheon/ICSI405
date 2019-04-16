public class CheckingBankAccount {

	private int balance;
	
	public CheckingBankAccount() //Constructor of CheckingBankAccount class.
	{
		this.balance = 0; //Set initially balance to 0.
	}
	
	public void withdraw(int w) //Set method for current balance after withdrawing.
	{
		balance = balance - w; 
	}
	
	public void deposit(int d) //Set method for current balance after depositing.
	{
		balance = balance + d;
	}
	
	public int getCurrentBalance() //Get method for current balance.
	{
		return balance;
	}
}
