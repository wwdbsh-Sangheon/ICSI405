public class Employee {
	
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee() //Constructor of Employee class.
	{			
		this.firstName = null;
		this.lastName = null;
		this.monthlySalary = 0.0;
	}
	
	public void setFirstName(String firstN) //Set method for first name.
	{
		this.firstName = firstN;
	}
	
	public void setLastName(String lastN) //Set method for last name.
	{
		this.lastName = lastN;
	}
	
	public void setMonthlySalary(double mSalary) //Set method for monthly salary.
	{
		if(mSalary < 0) //If mSalary is less than 0, set monthlySalary to 0.0. Otherwise, set monthlySalary to mSalary.
		{
			this.monthlySalary = 0.0;
		}
		else
		{
			this.monthlySalary = mSalary;
		}
	}
	
	public void setRaisingSalary(double rSalary) //Set method for raising salary.
	{
		this.monthlySalary = rSalary * 1.1;
	}
	
	public String getFirstName() //Get method for first name.
	{
		return firstName;
	}
	
	public String getLastName() //Get method for last name.
	{
		return lastName;
	}
	
	public double getMonthlySalary() //Get method for monthly salary.
	{
		return monthlySalary;
	}
}
