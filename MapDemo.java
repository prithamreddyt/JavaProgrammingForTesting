package Javasessions;

import java.util.HashMap;

public class MapDemo

{

	public static void main(String[] args)
	
	{
		HashMap<String,Integer> omap=new HashMap<String,Integer>();
		
		omap.put("Akhila",20);
		omap.put("Nanda",22);
		omap.put("Pritham",24);
		omap.put("Praveen",25);
		omap.put("Shashikala",28);
		


		System.out.println("Displaying Map Key Value Pairs: "+omap);

		System.out.println("Getting the Value as per given Key: "+omap.get("Akhila"));

		
		System.out.println("Map Size is: "+omap.size());
		
		System.out.println("Printing all values in HashMap");
		
		for(String names:omap.keySet())
		{
			System.out.println(omap.get(names));
			
		}
		
		if(omap.containsValue(20))
		{
			System.out.println("Based on the value 20, the key is: Akhila");
		}
		
		
		
	}

}
