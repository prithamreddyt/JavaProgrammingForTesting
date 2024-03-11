package Javasessions;


public abstract class AbstractDemo
	
	{
	
		void userNameField()
		{
			System.out.println("userNameField");
		}
		
		void passwordField()
		{
			System.out.println("passwordField");
		}
		
		abstract void loginButtonField();
		
	}

	class AbstractDemo2 extends AbstractDemo
	{
	
		void loginButtonField()
		{
			System.out.println("Implemented Class from Parent Abstract class");
		}
	
	}

	public static void main(String[] args)

	{
		//create object here
	} 
	




