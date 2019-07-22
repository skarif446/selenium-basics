package stevejobs;

import java.util.Scanner;

public class Test92
{
	public static void main(String[] args)
	{
		//Get data from Keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String x=sc.nextLine();
		String y="";   //null
		for(int i=x.length()-1;i>=0;i--)
		{
			char c=x.charAt(i);
			y=y+c;
		}
		System.out.println(y);
		if(x.equals(y))
		{
			System.out.println("Palyndrome");                   
		}
		else
		{
			System.out.println("Not Palyndrome");
		}
		
	}
}









