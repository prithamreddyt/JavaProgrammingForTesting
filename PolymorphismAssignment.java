package Javasessions;

public class PolymorphismAssignment


{
			// method overloading - multiplication 

			void mul(int a, int b)
				{
					int result1=a*b;
					System.out.println("Multiplication of 2 numbers:" + result1);	
				}
		
			void mul(int a, int b, int c)
				{
					int result2=a*b*c;
					System.out.println("Multiplication of 3 numbers:" + result2);			
				}
			
			void mul(int a, int b, int c, int d)
				{
					int result3=a*b*c*d;
					System.out.println("Multiplication of 4 numbers:" + result3);			
				}
			
			void mul(int a, int b, int c, int d, int e)
				{
					int result4=a*b*c*d*e;
					System.out.println("Multiplication of 5 numbers:" + result4);			
				}
				
			
			// method overloading - subtraction 

			void subt(int a, int b)
				{
					int result1=a-b;
					System.out.println("Subtraction  of 2 numbers:" + result1);	
				}
			
			void subt(int a, int b, int c)
				{
					int result2=a-b-c;
					System.out.println("Subtraction  of 3 numbers:" + result2);			
				}
			
			void subt(int a, int b, int c, int d)
				{
					int result3=a-b-c-d;
					System.out.println("Subtraction  of 4 numbers:" + result3);			
				}
			
			void subt(int a, int b, int c, int d, int e)
				{
					int result4=a-b-c-d-e;
					System.out.println("Subtraction  of 5 numbers:" + result4);			
				}
				
		
		public static void main(String[] args)
		
			{
				PolymorphismAssignment obj=new PolymorphismAssignment();
				obj.mul(2,3);
				obj.mul(2,3,4);
				obj.mul(2,3,4,5);
				obj.mul(2,3,4,5,6);
	
					System.out.println("");			
	
				obj.subt(200,30);
				obj.subt(200,30,40);
				obj.subt(200,30,40,50);
				obj.subt(200,30,40,50,60);
	
			
			}
	
	
	
	
}
