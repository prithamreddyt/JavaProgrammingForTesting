package Javasessions;

public class MethodsinJava


	//Methods --> class members
	
	// 1. No return type and no input

			//Syntax: no return type, no input()
		/*
		* void method name()
		* {
		* 		body / statements
		* }
		*		
		*/

		// 2. Some return type, no input
		/*
		* return type method name()
		* {
		* 		body / statements
		* 		return method name;
		* }
		*		
		*/
	
		//3. Some return type, some input
		/*
		* return type method name()
		* {
		* 		body / statements
		* 		return method name;
		* }
		*		
		*/
	
		//4. No return type, some input -printed value in the method itself
		/*
		* no return type method name()
		* {
		* 		body / statements
		* 		System.out.println(method);
		* }
		*		
		*/



		{
		
			void test()
				{
					System.out.println("test");
				}
			
			int test2()
				
			{
				int a=10;
				int b=20;
				int sum=a+b;
				return sum;
			}

			int test3(int c, int d)
			
			{
				int sum=c+d;
				return sum;
			}
	
			
			
			public static void main(String[] args)
			
			{
				MethodsinJava obj=new MethodsinJava();
				obj.test();
				int result=obj.test2();
				System.out.println(result);
				
				int result1=obj.test3(50, 60);
				System.out.println(result1);
				
				
			}
		
		}
