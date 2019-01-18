

package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers {

	public static WebDriver driver;
	public static WebDriverWait waitForElement;
	public static String currentLanguage;
	
	public static void openWebBrowser()
	{
		System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		waitForElement=new WebDriverWait(driver, 120);
		//
	}
	
	
	public static void goToSite()
	{
		driver.get("http://www.qtptutorial.net/automation-practice/");
			
	}
	
	public static void closeBrowser()
	{
		driver.quit();
	}
	
}
	