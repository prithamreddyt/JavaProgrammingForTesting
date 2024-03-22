package Javasessions;

public class SumOfTwoNumbers

{

	public static void main(String[] args)
	
	{
		int[] a = new int[5]; // Initialize the array with size 5
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		 int sum = 0; // Initialize the sum variable
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			System.out.println(sum);
		}
	
		System.out.println(sum);
	}

}
