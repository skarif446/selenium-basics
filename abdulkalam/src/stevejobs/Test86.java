package stevejobs;
import java.util.Scanner;
public class Test86 
{
	public static void main(String[] args)
	{
		//Get limit
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int x=sc.nextInt();
		//Display numbers
		int d=1;
		int c=97;
		for(int i=1;i<=x;i++)                                  
		{
			//for digits
			for(int j=1;j<=i;j++)
			{
				System.out.print(d+" ");
			}
			d=d+1;
			System.out.println();
			//for chars
			for(int k=1;k<=i;k++)
			{
				System.out.print((char)c+" ");
			}
			c=c+1;
			System.out.println();
		}

	}

}
