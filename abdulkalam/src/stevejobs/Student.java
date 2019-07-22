package stevejobs;
public class Student 
{
	//data members
	static String iname="mindq";
	String cname;
	long rno;
	//Constructor method
	public Student(String a,long b)
	{
		cname=a;
		rno=b;
	}
	//Operational method
	public void display()
	{
		System.out.println(iname+":"+cname+":"+rno);
	}
}
