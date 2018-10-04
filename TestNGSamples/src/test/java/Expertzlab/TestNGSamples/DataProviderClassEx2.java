package Expertzlab.TestNGSamples;

import org.testng.annotations.DataProvider;

public class DataProviderClassEx2 {
	
	@DataProvider(name="SearchProvider")
	
		public static Object[][] getDataFromDataprovider()
		{
			return new Object[][] {
				{"CV","India"},
				{"Philip","USA"},
				{"Kotler","UK"}
			};
		}
	}


