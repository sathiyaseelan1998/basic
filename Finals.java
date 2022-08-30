public class Finals
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
		finally
		{

			System.out.println("I Am Finally Block...");
		}

		try
		{
			String name="dhoni";
			System.out.println(name.charAt(10));
		}
		
		finally
		{

			System.out.println("I Am Finally Block 2");
		}
		System.out.println("bye...");

	}


}