package stevejobs;
import java.util.Scanner;
public class Test94
{
	public static void main(String[] args) 
	{
		//Get data from Keyboard
		Scanner sc=new Scanner(System.in);                      
		System.out.println("Enter a word");
		String s=sc.nextLine();
		int uc=0;
		int lc=0;
		int dc=0;
		int scc=0;
		for(int i=0;i<s.length();i++)
		{
			char x=s.charAt(i);
			if(x>=65 && x<=90)
			{
				uc=uc+1;
			}
			else if(x>=97 && x<=122)
			{
				lc=lc+1;
			}
			else if(x>=48 && x<=57)
			{
				dc=dc+1;
			}
			else
			{
				scc=scc+1;
			}
		}
		System.out.println("Upper case chars are "+uc);
		System.out.println("Lower case chars are "+lc);
		System.out.println("Digits count is "+dc);
		System.out.println("Special case chars are "+scc);
	}
}
