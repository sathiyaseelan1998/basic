public class Trys
{
	public static void main(String arg[])
	{

		try
		{
			int x=10/0;
			System.out.println(x);

			int z[]=new int[3];	
			System.out.println(z[3]);

			String name="dhoni";
			System.out.println(name.charAt(10));

			String s=null;
			System.out.println(s.length());

		}
		
		catch(ArithmeticException a)
		{

			System.out.println("Arithmetic ");
		}
		catch(NullPointerException a)
		{
			System.out.println("NullPointer");

		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("ArrayIndexOutOfBounds");

		}
		catch(StringIndexOutOfBoundsException a)
		{
			System.out.println("StringIndexOutOfBounds");

		}
		catch(Exception a)
		{
			System.out.println("parent class");

		}
		System.out.println("......not exception.......");
	}


}