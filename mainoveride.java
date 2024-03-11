package Javasessions;




class AAA
	{
		public static void t1()
		{
			System.out.println("Static t1 Parent method");
		}
		
		public static void t2()
		{
			System.out.println("Static t2 parent method");
		}
	}


class BBB extends AAA

	{
		public static void t1()
			{
				System.out.println("Static child t1 method");
			}
		
		public static void t2()
			{
				System.out.println("Static t1 child method");
			}
		
	}





public class mainoveride {

	public static void main(String[] args) {

		
		
	}

}
