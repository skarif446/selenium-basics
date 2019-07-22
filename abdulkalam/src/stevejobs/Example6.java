package stevejobs;
public abstract class Example6 
{
	public int add(int x,int y)
	{
		int z=x+y;
		return(z);
	}
	public int subtract(int x,int y)
	{
		int z=x-y;
		return(z);
	}
	public abstract int multiply(int x,int y);
	public abstract int divide(int x,int y);
}
