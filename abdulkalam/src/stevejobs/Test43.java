package stevejobs;

import java.util.Iterator;

import org.sikuli.script.Button;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class Test43 
{
	public static void main(String[] args) throws Exception
	{
		Screen s=new Screen();
		s.click("sample2.png");
		Thread.sleep(5000);
		Iterator<Match> l=s.findAll("sample3.png");
		l.next().click();
		Thread.sleep(5000);
		l.next().doubleClick();
	}
}





