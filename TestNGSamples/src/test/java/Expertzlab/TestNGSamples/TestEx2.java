package Expertzlab.TestNGSamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import junit.framework.Assert;

public class TestEx2 {
	
	
	public static String baseUrl="http://newtours.demoaut.com/";
	
	 static WebDriver driver;
	 
	 public static void verifyHomepageTitle() {
		 
		 String expectedTitle="Welcome: Mercury Tours";
	       String actualTitle=driver.getTitle();
	        try {
	            Assert.assertEquals(actualTitle, expectedTitle);
	            System.out.println("Test Passed");
	            }catch(Throwable e){
	            System.out.println("Test Failed");
	       
	        }
	 }
	 
	 public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","/home/expertzlab21/chromedriver");
		 
		  driver=new ChromeDriver();
		  
		  driver.get(baseUrl);
	       verifyHomepageTitle();
	        driver.quit();
		 
	 }

}
