package Expertzlab.TestNGSamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelParaEx2 {
	
	WebDriver driver;

	@Test
	@Parameters({"browser"})
	public void verifypageTitle(String browser) {
		 if(browser.equalsIgnoreCase("chrome")) {
			 
			 System.setProperty("webdriver.chrome.driver","/home/expertzlab21/chromedriver");
				
				driver = new ChromeDriver();
		 }else if(browser.equalsIgnoreCase("firefox")){
			 
			 System.setProperty("webdriver.gecko.driver", 
						"/home/expertzlab21/swj/geckodriver");
				
				driver= new FirefoxDriver();
		 }	
		 
		 driver.get("http://www.google.com");
		 String strTitle=driver.getTitle();
	        System.out.println("Title:"+strTitle);
	        driver.close();
	}
}
