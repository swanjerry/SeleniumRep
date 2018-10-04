package Expertzlab.TestNGSamples;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGEx1 {
	
	
	
	@BeforeTest
public void fourthTest() {
		
		System.out.println("Fourth Test");
	}
	
	@BeforeClass
	
	public void thirdTest() {
		
		System.out.println("Third Test");
	}
	
	
    
	@BeforeMethod
	public void secondTest()
	{
		System.out.println("Second Test");
	}
	
	@Test
	public void firstTest() {
		
		 System.out.println("First Test");
	}

}
