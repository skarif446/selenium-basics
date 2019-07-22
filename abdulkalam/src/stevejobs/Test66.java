package stevejobs;
import java.util.Scanner;
public class Test66
{
	public static void main(String[] args) 
	{
		Example3 obj1=new Example3();
		obj1.method1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String temp=sc.nextLine();
		Example3 obj2=new Example3(20,temp);
		obj2.method1();
	}
}





