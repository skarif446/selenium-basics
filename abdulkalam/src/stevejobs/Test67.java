package stevejobs;

import java.util.Scanner;

public class Test67
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter course name");
		String temp1=sc.nextLine();
		System.out.println("Enter roll number");
		long temp2=Long.parseLong(sc.nextLine());
		Student s1=new Student(temp1,temp2);
		s1.display();
		System.out.println("Enter course name");
		String temp3=sc.nextLine();
		System.out.println("Enter roll number");
		long temp4=Long.parseLong(sc.nextLine());
		Student s2=new Student(temp3,temp4);
		s2.display();
	}
}
