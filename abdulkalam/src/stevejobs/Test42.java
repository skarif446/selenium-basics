package stevejobs;
import org.sikuli.script.Screen;
public class Test42 
{
	public static void main(String[] args) throws Exception
	{
		Screen s=new Screen();
		s.click("sample2.png");
		Thread.sleep(5000);
		if(s.exists("sample1.png")!=null)
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("No Match");
		}
	}
}
