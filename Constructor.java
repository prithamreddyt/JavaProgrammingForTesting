package Javasessions;

public class Constructor {

	int d;
	
	Constructor()
	{
		System.out.println("default constructor");
	}
	
	Constructor(int a)
	{
		System.out.println("parameterized constructor");
	}
	
	Constructor(int a, int b)
	{
		System.out.println("two parameterized constructor");
	}

	Constructor(int a, int b, int c)
	{
		System.out.println("three parameterized constructor");
	}

	Constructor(String name)
	{
		System.out.println("String based constructor");
	}
	
	/*Constructor(int d)
	*{
	*	this.d=d;
	*	System.out.println("initializing global variable to constructor");
	*	System.out.println(this.d);
	*	
	*}
	*/
	
	public static void main(String[] args)
	{
	
		Constructor obj1=new Constructor();
		Constructor obj2=new Constructor(10);
		Constructor obj3=new Constructor(10,20);
		Constructor obj4=new Constructor(10,20,30);
		Constructor obj5=new Constructor("pritham");
		

	}

}
