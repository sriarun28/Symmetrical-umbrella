class MarkAndAgeEligibility 
{
	public static void main(String[] args) 
	{
		int age=21;
		int mark=90;
		
		if(age>=21)
		{	
			if(mark>35 && mark<50)
			{
				System.out.println("Pass");
			}	
		
			else if(50<mark && mark<65)
			{
				System.out.println("Average");
			}
			
			else if(65<mark && mark<85)
			{
				System.out.println("First Class");
			}	
			
			else if(85<mark && mark<100)
			{
				System.out.println("Distinction");
			}	
			
			System.out.println("Eligible for writing this exam");
		}	
		else
		{
			System.out.println("Not eligible for writing this exam");
		}	

	}

}
