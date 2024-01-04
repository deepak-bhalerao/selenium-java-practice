package ThisSuperConstructors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		// initElements method used to initialize the page objects elements 
		// and its static method of the page factory class
		// Page factory is a class provided by selenium webdriver to support page object design pattern
	}
	
//  We have to maintain the same driver instance across all page classes in page object model framework
//  So across all the classes we actually using contructor to maintain the driver instance
//	So this constructor actually accepting an arguments and what kind of argument type webdriver
//	To maintain the same driver instance across all the classes in Page Object model framework we need to use contructor 
}

class Base 
{	
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver=new ChromeDriver();
		LoginPage lp=new LoginPage(driver);
	}
}
