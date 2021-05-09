package chapter01;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchTest 
{
   private WebDriver driver;
   
   @Before
   public void setUp()
   {
      //Launch the nre instance for Chrome
	   driver =new ChromeDriver();
	   //Maximize the browser Windo
	   driver.manage().window().maximize();
	   //Navigate to google
	   driver.get("http://google.com");
   }
   
   @Test
   public void testGoogleSearch()
   {
	   WebElement element=driver.findElement(By.name("q"));
	   //Clear the existing text value
	   element.clear();
	   
	   //Enter new text to search for
	   element.sendKeys("Eclipse");
	   
	   //Now Submit the form
	   element.submit();

   
	   // Google's search is rendered dynamically with JavaScript.
	   // wait for the page to load, timeout after 10 seconds
	   new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>()
	   {
		   public Boolean apply(WebDriver d) 
		   {
			   return d.getTitle().toLowerCase().startsWith("selenium testing tools cookbook");
		   }
	   });

    assertEquals("Selenium testing tools cookbook - Google Search",
		driver.getTitle());
}


   @After
   public void tearDown() throws Exception
   {
	   // Close the browser
	   driver.quit();
   }
}
