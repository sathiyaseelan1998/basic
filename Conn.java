public class Conn
{

	public static void main(String a[])
	{
		for(int i=0;i<10;i++)
		{
			if(i<=5)

			{
				break;
			}

			System.out.println("break="+i);
		}

			System.out.println("----------------------");

		for(int j=0;j<8;j++)
		{

			if(j<=5)

			{
				continue;
			}

			System.out.println("continue="+j);
		}
	}

}