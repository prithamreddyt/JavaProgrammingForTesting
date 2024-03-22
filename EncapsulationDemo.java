package Javasessions;

public class EncapsulationDemo

{

	String name = "Pritham";
	int account_number = 12345;
	int atmpin = 1234;
	
	
	
	
	public static void main(String[] args)
	
	{
		
		EncapsulationDemo obj=new EncapsulationDemo();
		System.out.println(obj.name);
		System.out.println(obj.account_number);
		System.out.println(obj.atmpin);
		
		
		// changing the values
		
		obj.name="nucot";
		System.out.println(obj.name);
		
				
		
	}

}
