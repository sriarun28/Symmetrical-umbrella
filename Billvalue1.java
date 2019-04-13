class Billvalue1
{
	public static void main (String[]args)
	{
		double price=100;
		int quantity=3;
		double discount=10;
		int tax=10;
		double bill1=((price*quantity)-(discount*(price*quantity)/100))+(tax*((price*quantity)-(discount*(price*quantity)/100))/100);
		
		System.out.println(bill1);
	}
}	
