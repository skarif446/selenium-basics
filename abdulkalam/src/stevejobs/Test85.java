package stevejobs;

import java.util.Scanner;

public class Test85
{
	public static void main(String[] args) 
	{
		//Get limit
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int x=sc.nextInt();
		//Display numbers
		for(int i=97;i<=x+97;i++)                                  
		{
			for(int j=97;j<=i;j++)
			{
				System.out.print((char)j);
			}
			System.out.println();
		}
	}
}
