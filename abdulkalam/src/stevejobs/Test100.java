package stevejobs;

public class Test100
{
	public static void main(String[] args) 
	{
		Animal obj1=new Animal();
		obj1.method(); //method() of Animal class
		Dog obj2=new Dog();
		obj2.method(); //method() of Dog class
		Animal obj3=new Dog();
		obj3.method(); //method() of Dog class
	}
}



