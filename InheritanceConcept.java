package Javasessions;


	class AA
		{
			void show()
			{
				System.out.println("Show Parent");
			}
			
			void display()
			{
				System.out.println("Display Parent method");
			}
		}


	class BB extends AA
	
		{
			void show()
			{
				System.out.println("Show method in parent and child class");
			}
		
			void test()
			{
				System.out.println("Test child method");
			}
			
		}


	public class InheritanceConcept
	
	
	{
	
		public static void main(String[] args)
		
		{
			AA obj=new AA();
			BB obj1=new BB();
			
			obj.show();
			obj1.show();
			obj.display();
			obj1.test();
			
	
		}
	
	}
