class Billvalue
{
	public static void main (String[]args)
	{
		double price=90.50;
		int quantity=4;
		double discount=5.00;
		int tax=10;
		double bill=((price*quantity)+((price*quantity)*tax/100))-(discount*((price*quantity)+((price*quantity)*tax/100))/100);
		
		
		System.out.println(bill);
	}
}	