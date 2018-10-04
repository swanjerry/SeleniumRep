package Expertzlab.TestNGSamples;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class TestNGFBEx1 {
	
	
	 WebDriver driver;
	
	@Test(priority=1)
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver","/home/expertzlab21/chromedriver");
		driver=new ChromeDriver();
	}
		@Test(priority = 2)
		public void launchGoogle()
		
		{
			
			driver.get("http://www.google.co.in");
			driver.quit();
		}
	
		
	

}
