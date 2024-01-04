package TestNG_Attributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsOnMethodTest {
	
	static WebDriver driver;
	private String user="1234567890";
	private String pass="Test@123";
	
	static String signInText="//span[text()='Hello, sign in']";
	static String userInput="//input[@id='ap_email']";
	static String continueBtn="//input[@id='continue']";
	static String passInput="//input[@id='ap_password']";
	static String signInBtn="//input[@id='signInSubmit']";
	static String DeliverToUser="//span[@id='glow-ingress-line1']";
	
	@Test
	public void setUp()  
	{
		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions handleSSL=new ChromeOptions();
		driver=new ChromeDriver(handleSSL);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));   
		}
	
//   In TestNG, if a dependent method fails, by default, the next method that depends on the failed method will not execute.
//	 If a method (let's call it Method A) depends on another method (Method B), it means that Method A will only execute if Method B executes successfully.
//   If Method B fails, TestNG will mark Method A as "skipped" and will not execute it.
//   If Method B passes, then TestNG will execute Method A.
	
//	 You can override this behavior using the alwaysRun attribute. 
//	 If you set alwaysRun = true in your @Test annotation for Method A, 
//	 then Method A will execute even if Method B fails. Here's an example:
	
	@Test(dependsOnMethods= "setUp" , alwaysRun=true )
	public void Login()  {
		driver.findElement(By.xpath(signInText)).click();
		driver.findElement(By.xpath(userInput)).sendKeys(user);
		driver.findElement(By.xpath(continueBtn)).click();
		driver.findElement(By.xpath(passInput)).sendKeys(pass);
		driver.findElement(By.xpath(signInBtn)).click();   }
	
	@AfterTest
	public void verifyHomePage()    {
		boolean userOnHomePage=driver.findElement(By.xpath(DeliverToUser)).isDisplayed();
		if(userOnHomePage==true) {
			System.out.println("User Logged in Successfully..");
			Assert.assertTrue(true); }
		else {
			System.out.println("User Logged in Failed..");
			Assert.assertTrue(false); }    }
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
