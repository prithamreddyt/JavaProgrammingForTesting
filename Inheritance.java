package Javasessions;

		/* Types of Inheritance
		 * Single parent multiple child
		 * Multiple parent multiple child
		 * Single parent Single child
		 * Multiple parent Single Child
		 * 
		 * class child_class_name extends parent_class_name
		 */

		
		class A
			{
				void test()
				{
					System.out.println("Test method in parent class");
				}
			
				void test2()
				{
					System.out.println("Test method in parent class");
				}
			}
			
		class B extends A
			{
				
			// Runtime polymorphism, will override the parent class for inherited method
			void test()
				{
					System.out.println("Test method inherited in child class");
				}
			
				void test3()
				{
					System.out.println("Test method in child class");
				}
			
			}
		
		public class Inheritance

		{
	
			public static void main(String[] args)
					
					{		
						A obj=new A();
						obj.test();
						obj.test2();						
					
						B obj1=new B();
						obj1.test();
						obj1.test3();						
					}	

		}
