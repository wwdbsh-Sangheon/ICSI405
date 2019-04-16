public class HW1Problem2 {
	
	public HW1Problem2()
	{
		
	}
	
	public boolean multiple(int first, int second) //Method for first question.
	{
		int remainder = first % second;
		
		if(remainder == 0 ) //If remainder is zero, return true. Otherwise, return false.
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int remainder(int number) //Method for second question.
	{
		return number % 7; //Return remainder by using %.
	}
	
	public double distance(double x1, double y1, double x2, double y2) //Method for third question.
	{
		return Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2)); //Return distance by using Math.sqrt and Math.pow.
	}
	
	public void coinFlip() //Method for bonus question.
	{
		int tail = 0, head = 0, flip = 1, face;
		
		while(flip <= 10)
		{
			face = (int)(Math.random() * 2) + 1; //Generate random number.
			
			switch(face)
			{
				case 1:
					++head;
					break;
					
				case 2:
					++tail;
					break;
			}
			flip++;
		}
		System.out.println("Tails\tHeads");
		System.out.println(tail + "\t" + head);
	}
	
}
