package Expertzlab.TestNGSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class MultiBrowserEx1 {

	
		public WebDriver driver;
		
		
		@Parameters("browser")
		@BeforeClass	
		
		public void beforeTest(String browser) {
			
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver",
						"/home/expertzlab21/chromedriver");
				
				driver=new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", 
						"/home/expertzlab21/swj/geckodriver");
				
				driver= new FirefoxDriver();
			}
			driver.get("http://www.store.demoqa.com");
		}
		
		@Test
		
		public void login() throws InterruptedException {
			
			driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		     
	        driver.findElement(By.id("log")).sendKeys("testuser_1");
	     
	        driver.findElement(By.id("pwd")).sendKeys("Test@123");
	     
	        driver.findElement(By.id("login")).click();
			
		}
		
         @AfterClass  
		public void afterTest()
           {
        	   driver.quit();
           }
		
			
		
		
}




