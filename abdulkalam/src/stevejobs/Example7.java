package stevejobs;
public class Example7
{
	//Data members
	public int x;
	public int y;
	//private constructor
	private Example7()
	{
		x=10;
		y=20;
	}
	//static method
	public static Example7 create()
	{
		Example7 o=new Example7();
		return(o);
	}
	//non-static method
	public void display()
	{
		System.out.println(x+" "+y);
	}
}
