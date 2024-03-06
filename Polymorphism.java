package Javasessions;

public class Polymorphism

{

		// Method Overloading or Compile time Polymorphism
		// Same method name with multiple functions
	
			void add(int a, int b)
			{
				int result1=a+b;
				System.out.println(result1);	
			}
	
			void add(int a, int b, int c)
			{
				int result2=a+b+c;
				System.out.println(result2);			
			}
	
			void add(int a, int b, int c, int d)
			{
				int result3=a+b+c+d;
				System.out.println(result3);			
			}
	
			void add(int a, int b, int c, int d, int e)
			{
				int result4=a+b+c+d+e;
				System.out.println(result4);			
			}
	
	public static void main(String[] args)
		
	{
		Polymorphism obj=new Polymorphism();
		obj.add(2, 3);
		obj.add(2, 3,4);
		obj.add(2, 3,4,5);
		obj.add(2, 3,4,5,6);

	}

}
