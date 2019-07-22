package stevejobs;
public class Test98 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Thread.sleep(5000);
		int x=10;
		int y=0;
		int z;
		try
		{
		 z=x/y;
		}
		catch(Exception ex)
		{
			z=0;
		}
		System.out.println(z);
	}
}
