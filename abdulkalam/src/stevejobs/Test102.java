package stevejobs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Test102
{
	public static void main(String[] args) throws Exception
	{
		//Open existing file for data reading
		File f=new File("paragraph.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		//Get a word from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word to search in text file");
		String x=sc.nextLine();
		int count=0;
		//Searching
		String l;
		while((l=br.readLine())!=null)
		{
			String p[]=l.split(" ");
			for(int i=0;i<p.length;i++)
			{
				if(x.equalsIgnoreCase(p[i]))
				{
					count=count+1;
				}
			}
		}
		System.out.println(x+" came "+count+" times");
		br.close();
		fr.close();
	}
}






