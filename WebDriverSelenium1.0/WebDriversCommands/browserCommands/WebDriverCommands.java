package browserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		String Url="http://www.shop.demoqa.com";
		
		
		WebDriver driver=new ChromeDriver();
		//launch the ToolsQA  WebSite
		driver.get(Url);
		
		String title=driver.getTitle();
		System.out.println("The title is: "+ title);


	}

}
