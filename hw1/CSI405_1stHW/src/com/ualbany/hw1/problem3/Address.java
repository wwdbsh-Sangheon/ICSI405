public class Address {

	private String line1;
	private String line2;
	private String city;
	private String state;
	private String zip;
	
	public Address() //Constructor of Address class. Set all of variables to null initially.
	{
		this.line1 = null;
		this.line2 = null;
		this.city = null;
		this.state = null;
		this.zip = null;
	}
	
	public void setLine1(String l1) //Set method for line 1.
	{
		this.line1 = l1;
	}
	
	public void setLine2(String l2) //Set method for line 2.
	{
		this.line2 = l2;
	}
	
	public void setCity(String c) //Set method for city.
	{
		this.city = c;
	}
	
	public void setSate(String s) //Set method for state.
	{
		this.state = s;
	}
	
	public void setZip(String z) //Set method for Zip code.
	{
		this.zip = z;
	}
	
	public String getLine1() //Get method for line 1.
	{
		return line1;
	}
	
	public String getLine2() //Get method for line 2.
	{
		return line2;
	}
	
	public String getCity() //Get method for city.
	{
		return city;
	}
	
	public String getState() //Get method for state.
	{
		return state;
	}
	
	public String getZip() //Get method for Zip code.
	{
		return zip;
	}
}
