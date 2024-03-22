package Javasessions;

public class ThrowsDemo

{

	void show1()
	{
		System.out.println("Show 1");
		show2(); //Calling method
	}
	void show2()
	{
		System.out.println("Show 2");
		
		try
		{
			show3();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArthimeticException is coming");
		}
		
	}
	void show3() throws ArithmeticException
	{
		System.out.println("Show 3");
		show4();
	}
	void show4() throws ArithmeticException
	{
		System.out.println("Show 4");
		int i=10/0;
	}
	
		
	
	public static void main(String[] args) 
	
	
	{
	
		ThrowsDemo obj=new ThrowsDemo();
		obj.show1();
		
		
	}

}
