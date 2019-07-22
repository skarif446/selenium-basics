package stevejobs;

import java.util.Scanner;

public class Test75
{
	public static void main(String[] args) 
	{
		//Get number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		//Check it as even or odd
		if(x%2==0)
		{
			System.out.println(x+" is even number");
		}
		else
		{
			System.out.println(x+" is odd number");              
		}

	}

}









