package Javasessions;


// Class Syntax
/*
 * 
 * class class_name
 * {
 * 		//body-->statements
 * 			Variables -- ((Class variable/Global Variables), Local Variables, final variables)
 * 			methods
 * 			constructor
 * 			static block
 * }
 */


//Method Syntax
/*
* 
* datatype method name()
* {
* 		body / statements
* }
*/


//Object Syntax
/*
* 
* 	classname object_name=new class_name();
* 
*/



public class ClassDemo

{

	// Class variable(global variable)
	
	int a =10; //normal variable
	final int b=20;//final variable
	static int c=30;//static variable
	
	
	//methods
	
	//normal method
	void show()
		{
			//local variables
			int i=10;
			
			System.out.println("The value of show id --> "+i);
		}
		
	//static method
	static void show1()
		{
			//local variables
			int ii=10;
			
			System.out.println("The value of show1 is --> "+ii);
		}
	
	
	public static void main(String[] args)
	
	{
		
		// utilizing class using objects
		
		ClassDemo obj=new ClassDemo();
		
			System.out.println("value of a "+obj.a);
			System.out.println("value of b "+obj.b);
			
			System.out.println("to execute class: show");
			obj.show();
			
			
	}

}
