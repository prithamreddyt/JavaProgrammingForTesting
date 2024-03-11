package Javasessions;

public class PolymorphismConcept

{

	// main method overloading
	
	public static void main()
	{
		System.out.println("No Arguments");

	}

	public static void main(int a)
	{
		System.out.println("Arguments as Integer"+a);

	}

	public static void main(String s)
	{
		System.out.println("Arguments as String"+s);

	}

	public static void main(String[] args)
	{
		main();
		main(10);
		main("Pritham");

	}

}
