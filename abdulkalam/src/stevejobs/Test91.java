package stevejobs;

import java.util.Scanner;

public class Test91 
{
	public static void main(String[] args) 
	{
		//Get data from Keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		System.out.println("Enter a word");
		String y=sc.nextLine();
		x=x.toLowerCase();
		y=y.toLowerCase();
		int count=0;
		String z[]=x.split(" "); //space is separator
		for(int i=0;i<z.length;i++)
		{
			if(z[i].equals(y))
			{
				count=count+1;
			}
		}
		System.out.println("Count of "+y+" is "+count);        

	}

}







