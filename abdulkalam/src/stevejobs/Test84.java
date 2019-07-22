package stevejobs;

import java.util.Scanner;

public class Test84
{
	public static void main(String[] args) 
	{
		//Get limit
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int x=sc.nextInt();
		//Display numbers
		for(int n=1;n<=x;n++)                                  
		{
			int flag=0;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.print(n+" ");
			}
		}
	}
}







