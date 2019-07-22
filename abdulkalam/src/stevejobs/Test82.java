package stevejobs;

import java.util.Scanner;

public class Test82
{
	public static void main(String[] args)
	{
		//Get number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		//Check for prime
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
			System.out.println(n+" is prime number");
		}
		else
		{
			System.out.println(n+" is not prime number");       
		}
	}
}







