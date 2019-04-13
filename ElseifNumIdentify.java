
class ElseifNumIdentify
 {
	public static void main(String[] args)
	{
		
		for (int a=1;a<=50;a++)
		{
			if(a%2==0)
			{
				System.out.println("The numbers divisible by 2 is "+a);
			}
		
			else if(a%3==0)
			{
				System.out.println("The numbers divisible by 3 is "+a);
			}	
		
			else if(a%5==0)
			{
				System.out.println("The numbers divisible by 5 is "+a);
			}	
		
			else
			{
				System.out.println("The numbers not divisible by 2,3,5 is "+a);
			}	
		}
		
	}
}
		
