package Chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChrome {

	public static void main(String[] args)
	{
		
		//Set the property where is stored the chromedriver.exe --see the properties of the project.
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		//Create a new instance of the Chrome driver
		WebDriver driver=new ChromeDriver();
		
		//open the URL where is going to start the test
		driver.get("http://toolsqa.com/automation-practice-form/");
     
	}

}
