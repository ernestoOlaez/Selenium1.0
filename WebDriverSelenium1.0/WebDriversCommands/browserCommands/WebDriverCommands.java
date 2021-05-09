package browserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		String Url="https://demoqa.com/";
		
		
		WebDriver driver=new ChromeDriver();
		//launch the ToolsQA  WebSite
		driver.get(Url);
		
		//Storing title name in  the String variable
		String title=driver.getTitle();
		
		int titleLeght=driver.getTitle().length();
		
		//Printing Title and title length on Console Window
		System.out.println("The title is: "+ title);
		System.out.println("Leght of title is: " +titleLeght);
		
		//Storing URL in String variable
		String actualURL=driver.getCurrentUrl();
		if(actualURL.equals(Url))
		{
			System.out.println("Verification successful - The correct Url is opened.");
		}
		else
		{
			System.out.println("Verification failed!");
		}
        
		//Storing the Page source in String Variable
		String pageSource=driver.getPageSource();
		System.out.println("Page Source: "+pageSource);
		
		String needle="Book Store Application";
		String subStr;
	    int posIni;
	    int posEnd;
	    posEnd=needle.length();
		if(pageSource.indexOf(needle)!=-1)
		{
			System.out.println("Found the word " + needle +
                    " at index number " + pageSource.indexOf(needle));
			posIni= pageSource.indexOf(needle);
			subStr=pageSource.substring(posIni,posIni+posEnd);
			System.out.println(subStr);
		}
		else
		{
			System.out.println("Can't find " + needle);
		}
		
		//Storing Page Source length in Int variable
		int pageSourceLength=pageSource.length();
		System.out.println("Total length pf the Page source is: "+ pageSourceLength);
		

	}

}
