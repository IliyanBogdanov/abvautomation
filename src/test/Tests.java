package test;
import org.testng.annotations.Test;
import base.BaseClass;
import pages.Page;


public class Tests extends BaseClass{
	
	@Test
	public void clicks() throws Exception{
		
		Page.LoginPage().clickOnElementLocatedById();
		Page.LoginPage().clickOnElementLocatedByClass();
		Page.LoginPage().clickOnElementLocatedByName();
		Page.LoginPage().clickOnElementLocatedByLink();
		Page.LoginPage().clickOnElementLocatedByPartialLink();
		Page.LoginPage().clickOnElementLocatedByCSS();
		Page.LoginPage().clickOnElementLocatedByAbsoluteXpath();
		Page.LoginPage().clickOnElementLocatedByRelativeXpath();
		//Page.LoginPage().clickOnElementLocatedByContainsTextXpath();
	}
	

	
	
	
}
