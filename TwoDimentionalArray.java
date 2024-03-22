package Javasessions;

public class TwoDimentionalArray

{

	public static void main(String[] args)
	
	{
		int array[][] = new int[2][2];
		
		array[0][0]=1;
		array[0][1]=2;
		array[1][0]=3;
		array[1][1]=4;
		
		System.out.println(array.length);
	
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				System.out.println(array[i][j]);
				
			}
		

		}

		
		System.out.println("Display of Array in Matrix form");
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				System.out.print(array[i][j] + " "); // without going to new line
				
			}

		}
	}

}
