package Expertzlab.TestNGSamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParameterWithDataProviderClassEx2 {

	WebDriver driver;
	String driverPath="/home/expertzlab21/swj/geckodriver";
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver= new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get("https://google.com");
		
	}
	
	@Test(dataProvider="SearchProvider",dataProviderClass=DataProviderClassEx2.class)
	public void testMethod(String author,String searchkey) throws InterruptedException {
		
WebElement searchtext=driver.findElement(By.name("q"));
		
		searchtext.sendKeys(searchkey);
		System.out.println("Welcome : "+author+"Your search key is :"+searchkey);
		
	
		Thread.sleep(1000);
		
		String testValue=searchtext.getAttribute("value");
		System.out.println(testValue+"***"+searchkey);
		
searchtext.clear();
		
		Assert.assertTrue(testValue.equalsIgnoreCase(searchkey));
		
		
	}
	
}
