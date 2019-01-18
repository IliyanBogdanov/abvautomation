package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;



public class LoginPage {
	
	@FindBy(id="idExample") 
	private WebElement idButton;
	
	@FindBy(className="buttonClassExample") 
	private WebElement classButton;
	
	@FindBy(name="NameExample") 
	private WebElement nameButton;
	
	@FindBy(linkText="Click me using this link text!") 
	private WebElement linkButton;
	
	@FindBy(partialLinkText="Click me") 
	private WebElement partialLinkButton;
	
	@FindBy(css=".et_pb_promo_button[href='/button-success/']")
	private WebElement cssButton;
	
	@FindBy(xpath="html/body/div[1]/div[2]/div/article/div/div[3]/div/div[1]/div[2]/a")
	private WebElement absoluteXpathButton;
	
	@FindBy(xpath="//input[@value='Xpath Button 2']")
	private WebElement relativeXpathButton;
	
	@FindBy(xpath="//a[contains(text(),'Clickable Icon')]")
	private WebElement containsTextButton;
	
	public void clickOnElementLocatedById() throws InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(idButton));
		idButton.click();
		Thread.sleep(2000);
		Helpers.driver.navigate().back();
			
	}
	
	public void clickOnElementLocatedByClass() throws InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(classButton));
		classButton.click();
		Thread.sleep(2000);
		Helpers.driver.navigate().back();
		
	}
	
	public void clickOnElementLocatedByName() throws InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(nameButton));
		nameButton.click();
		Thread.sleep(2000);
		Helpers.driver.navigate().back();
		
	}
	
	public void clickOnElementLocatedByLink() throws InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(linkButton));
		linkButton.click();
		Thread.sleep(2000);
		Helpers.driver.navigate().back();
		
	}
	
	public void clickOnElementLocatedByPartialLink() throws InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(partialLinkButton));
		partialLinkButton.click();
		Thread.sleep(2000);
		Helpers.driver.navigate().back();
		
	}
	
	public void clickOnElementLocatedByCSS() throws InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(cssButton));
		cssButton.click();
		Thread.sleep(2000);
		Helpers.driver.navigate().back();
		
	}
	
	public void clickOnElementLocatedByAbsoluteXpath() throws InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(absoluteXpathButton));
		absoluteXpathButton.click();
		Thread.sleep(2000);
		Helpers.driver.navigate().back();
		
	}
	
	public void clickOnElementLocatedByRelativeXpath() throws InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(relativeXpathButton));
		relativeXpathButton.click();
		Thread.sleep(2000);
		Helpers.driver.navigate().back();
		
	}
	
	public void clickOnElementLocatedByContainsTextXpath() throws InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(containsTextButton));
		containsTextButton.click();
		Thread.sleep(2000);
		Helpers.driver.navigate().back();
		
	}
	}
	

