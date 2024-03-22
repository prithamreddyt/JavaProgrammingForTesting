package Javasessions;

public class MultipleExceptions

{
	
	int a;
	
	
		
			public static void main(String[] args)
			
			{
				MultipleExceptions obj=new MultipleExceptions();
				obj=null;
				
				try
				{
					obj.a=20;
					int i=5/0;
				}
				
				catch(NullPointerException np)
				{
					System.out.println("NP is coming");
				}
				
				catch(ArithmeticException ae)
				{
					System.out.println("ae is coming");
				}
				catch(RuntimeException re)
				{
					System.out.println("NP is coming");
				}
				catch(Exception e)
				{
					System.out.println("e is coming");
				}
				
			}

}
