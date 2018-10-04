package Expertzlab.TestNGSamples;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGEx3 {



	// Priority Based Example
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before each Test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After each Test");
	}
	
	
	@Test(priority=0)
	public void firstTest() {
		
		 System.out.println("First Test");
	}

	@Test(priority=-1) // Takes the lowest priority method
	public void secondTest() {
		
		 System.out.println("Second Test");
		
	}

	@Test(priority=2)
	public void thirdTest() {
		
		 System.out.println("Third Test");
	}

}
