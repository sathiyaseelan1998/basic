public class De
{
	public static void main(String arg[])
	{
		int n=5;
		int a[]=new int[n];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		n=n+1;
		int p=5;
		for(int i=p;i<=n;i++)
		{
			a[i]=a[i-1];
			
		}
		for(int i=0;i<=n;i++)
		{
			System.out.println(i+" "+a[i]);
	
		}
	}	
}