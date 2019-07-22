package stevejobs;

import java.util.ArrayList;
import java.util.Scanner;

public class Test96
{
	public static void main(String[] args)
	{
		//Get data from keyboard for array
		ArrayList<Integer> a=new ArrayList<Integer>();          
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int l=sc.nextInt();
		for(int i=0;i<l;i++)
		{
			System.out.println("Enter a number");
			a.add(sc.nextInt());
		}
		//Sorting
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l-1;j++)
			{
				if(a.get(j)>a.get(j+1))
				{
					int temp=a.get(j);
					a.set(j,a.get(j+1));
					a.set(j+1,temp);
				}
			}
		}
		//Display array
		for(int i=0;i<l;i++)
		{
			System.out.print(a.get(i)+" ");
		}
		System.out.println("Min value is "+a.get(0));
		System.out.println("Max value is "+a.get(l-1));

	}

}







