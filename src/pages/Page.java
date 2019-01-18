package pages;
import org.openqa.selenium.support.PageFactory;
import Helpers.Helpers;


public class Page {
	
	public static LoginPage LoginPage()
	{
		LoginPage LoginPage=new LoginPage();
		PageFactory.initElements(Helpers.driver, LoginPage);
		return LoginPage;
	}
	

	}

	
	
	

