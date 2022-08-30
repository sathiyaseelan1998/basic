public class Tc
{

	public static void main(String arg[])
	{

	
			try
			{
				int a=10/0;
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			try
			{
				String b=null;
				System.out.println(b.length());
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			try
			{
				String a="dhoni";
				char c=a.charAt(10);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			try
			{
				int a[]=new int[3];
				a[10]=2;
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

		System.out.println("i am not try catch block........");
	}


}