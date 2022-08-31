public class Superkey extends S
{
	int a=1000;
	
	void show()
	{
		System.out.println(a);
		System.out.println(super.a);
	}


	public static void main(String a[])
	{
		Superkey ob=new Superkey();
		ob.show();
	
	}
}