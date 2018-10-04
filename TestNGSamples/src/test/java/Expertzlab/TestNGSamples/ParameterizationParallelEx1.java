package Expertzlab.TestNGSamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationParallelEx1 {
	
	public WebDriver driver;
	
	@Test
	@Parameters({"author","searchkey"})
	
	public void testParameterWithXML(@Optional("Abc")String author,String searchkey) {
		
		System.setProperty("webdriver.chrome.driver","/home/expertzlab21/chromedriver");
		
		driver = new ChromeDriver();
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		  driver.get("https://google.com");
		  
		  WebElement searchText=driver.findElement(By.name("q"));
		  searchText.sendKeys(searchkey);
		  
		  System.out.println("Welcome :"+author+"Your Search Key is: "+searchkey);
		  
		  System.out.println("Thread will sleep now");
		  try
		  {
			  Thread.sleep(500);
			  
		  }catch(InterruptedException e)
		  {
			  e.printStackTrace();
		  }
		  
		  System.out.println("Value In Google Search Box="+searchText.getAttribute("id")+"Value given by input="+searchkey);
		
		  AssertJUnit.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchkey));
		  driver.quit();
	}
	

}
