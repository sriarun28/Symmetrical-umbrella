class TemperatureElseif 
{
	public static void main(String[] args) 
	{
	
		double a=25;
		
		if(17<=a && a<21)
		{
			System.out.println("Cold Weather");
		}
		
		else if(21<=a && a<25)
		{
			System.out.println("Normal");
		}
		
		else if(25<=a && a<31)
		{
			System.out.println("Hot Weather");
		}
		
		else if(31<=a && a<38)
		{
			System.out.println("Very hot Weather");
		}
		
		else
		{
			System.out.println("Not Determined");
		}		
	}
}
