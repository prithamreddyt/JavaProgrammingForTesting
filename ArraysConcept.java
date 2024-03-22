package Javasessions;

public class ArraysConcept

{

	
	
	public static void main(String[] args)
	
	{
		int a[]={1,2,3,4,5};
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
					
		System.out.println("The length of Array is:"+a.length);
		
		System.out.println(" ");

		System.out.println("addition of array elements");
		
		for(int i=0;i<a.length;i++)
			{
				System.out.println("index of array is: "+a[i]);
							
			}
		System.out.println(" ");
			
		System.out.println("using for each loop");

		System.out.println(" ");
		
		for(int aa:a)
			{
				System.out.println(aa);
			}
					
		System.out.println(" ");
		
		System.out.println("using Array of Strings");

		System.out.println(" ");
		
		
		String s[]= {"API","Selenium","Github","Java","Jenkins"};
		
			for(int i=0;i<s.length;i++)
			{
				System.out.println("index of array is: "+s[i]);
							
			}
				System.out.println(" ");
					
				System.out.println("using for each loop");
			
				System.out.println(" ");
		
			for(String ss:s)
				{
					System.out.println(ss);
				}
					
			

		}
		
		
}
 
