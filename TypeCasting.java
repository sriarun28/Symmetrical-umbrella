class TypeCasting
{
	public static void main (String[]args)
	{
		byte a=125;
		short b=a;
		int c=b;
		long d=c;
		
		long e=76;
		int f=(int)e;
		short g=(short)f;
		byte h=(byte)g;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
	}	
}	