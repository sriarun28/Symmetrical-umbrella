class Billingifelse
{
	public static void main (String[]args)
	{
		double price=90.50;
		int quantity=7;
		double discount1=5.00;
		double discount2=10.00;
		int tax=10;
		if(quantity>5)
			{
		double bill=((price*quantity)+((price*quantity)*tax/100))-(discount1*((price*quantity)+((price*quantity)*tax/100))/100);
		System.out.println("Bill:"+bill);
			}
		else
			{
		double bill1=((price*quantity)+((price*quantity)*tax/100))-(discount2*((price*quantity)+((price*quantity)*tax/100))/100);
		System.out.println("Bill:"+bill1);
			}
	}
}