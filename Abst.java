 class Abst extends Abs
{
	
	void show()
	{
		System.out.println("abstract");

	}

	int display(int a)
	{
		return a;
	}

	static void screen(String s)
	{
		System.out.println(s);
	}


	public static void main(String arg[])
	{
		Abst ob=new Abst();

		System.out.println(ob.name());

		ob.show();

		int b=ob.display(5);
		System.out.println(b);

		Abs.set();

		screen("computer");
		
	
		
	}

}