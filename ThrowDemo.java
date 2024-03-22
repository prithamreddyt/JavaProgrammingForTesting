package Javasessions;

public class ThrowDemo

{
	
	//Throw is use for customized exception

	public static void main(String[] args) throws Exception
	
	{
		int age = 11;
		System.out.println("ValidatingAge");
		
		
		if(age<18)
		{
			throw new Exception("Not eligble to vote");
		
		}
		else
		{
			System.out.println("Eligble to vote");
		}
		
	}

	
	
	
	
}
