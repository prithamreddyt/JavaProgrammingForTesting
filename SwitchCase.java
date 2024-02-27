package Javasessions;

public class SwitchCase {

	public static void main(String[] args) {
		
		
		String browser="chrome";
		
		switch(browser)
		{
			
		case "chrome":
			System.out.println("Launch Chrome browser");
			break;
			
		case "firefox":
			System.out.println("Launch firefox browser");
			break;
		
		case "IE":
			System.out.println("Launch IE browser");
			break;
		
		case "safari":
			System.out.println("Launch Safari browser");
			break;
		
		case "edge":
			System.out.println("Launch Edge browser");
			break;
		
		default:
			System.out.println("Please pass the correct browser name");
			break;
		}
		
		
		
	}

}
