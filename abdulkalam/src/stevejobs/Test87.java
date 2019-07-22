package stevejobs;

import java.util.Scanner;

public class Test87
{
	public static void main(String[] args)
	{
		//Get limit
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int x=sc.nextInt();
		for(int i=1;i<=x;i++)                                   
		{
			//for spaces
			for(int j=x;j>i;j--)
			{
				System.out.print(" ");
			}
			//for 1st triangle
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			//for 2nd triangle
			for(int l=1;l<i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
