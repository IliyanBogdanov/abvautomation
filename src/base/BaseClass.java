package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Helpers.Helpers;


public class BaseClass {

	//open browser , login

	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		
		Helpers.openWebBrowser();
		Helpers.goToSite();
			
	}
	
	
	
	//CloseBorwser
	@AfterMethod
	public void closeBrowser()
	{
		Helpers.driver.quit();
	}

}
