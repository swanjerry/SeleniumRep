package Expertzlab.TestNGSamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGEx2 {
	
	  public static String baseUrl="http://newtours.demoaut.com/";
	  static WebDriver driver;
	  
	  @Test
	  public static void verifyHomepageTitle() {
		  
		  System.setProperty("webdriver.chrome.driver","/home/expertzlab21/chromedriver");
		  driver=new ChromeDriver();
		  driver.get(baseUrl);
		  String expectedTitle="Welcome: Mercury Tours";
		  String actualTitle=driver.getTitle();
		  Assert.assertEquals(actualTitle, expectedTitle);
		  driver.close();
		  
	  }
	  

}
