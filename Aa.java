class Aa implements Inter1,Inter2
{

	public void a()
	{
	
		System.out.println("a");
	}
	public void b()
	{
	
		System.out.println("b");
	}
	public void c()
	{
	
		System.out.println("c");
	}
	static int y(int p)
	{
		return p;
	}

	public static void main(String arg[])
	{
		Aa ob=new Aa();

		Inter.x();
		
		ob.a();

		ob.b();

		ob.c();

		System.out.println(y(1000));

	}


}