package stevejobs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test95
{
	public static void main(String[] args)
	{
		Pattern p=Pattern.compile("[0-9]+");
		Matcher m=p.matcher("I was born in 1978 as 2nd kid");
		int c=0;
		while(m.find())
		{
			System.out.println(m.group());
			c=c+1;
		}
		System.out.println("No: of matches is "+c);             
	}
}







