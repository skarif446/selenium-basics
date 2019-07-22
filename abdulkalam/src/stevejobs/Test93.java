package stevejobs;

import java.util.Scanner;

public class Test93
{
	public static void main(String[] args)
	{
		//Get data from Keyboard
		Scanner sc=new Scanner(System.in);                      
		System.out.println("Enter a word");
		String s=sc.nextLine();
		s=s.toLowerCase();
		String u="";   //null
		for(int i=0;i<s.length();i++)
		{
			char x=s.charAt(i);
			int c=0;
			for(int j=0;j<i;j++)
			{
				char y=s.charAt(j);
				if(x==y)
				{
					c=c+1;
				}
			}
			if(c==0)
			{
				u=u+x;
			}
		}
		for(int i=0;i<u.length();i++)
		{
			int c=0;
			char x=u.charAt(i);
			for(int j=0;j<s.length();j++)
			{
				char y=s.charAt(j);
				if(x==y)
				{
					c=c+1;
				}
			}
			System.out.println(x+" came "+c+" times");
		}
	}

}





