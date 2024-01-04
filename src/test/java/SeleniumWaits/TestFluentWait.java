package SeleniumWaits;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFluentWait {
	
	public static WebDriver driver;
	private String signUpBtn ="//a[contains(text(),'Sign up for Facebook')]";
	private String month="//select[@id='month']/child::option";
	
	@Test
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions handleSSL=new ChromeOptions();
		handleSSL.setAcceptInsecureCerts(true);
		driver=new ChromeDriver(handleSSL);
	}
	
	@Test(dependsOnMethods="setUp" , alwaysRun=true)
	public void navigateToSignUp()
	{
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		Wait<WebDriver> fluentWait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		         WebElement ele=
	 fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signUpBtn)));
	 ele.click();
	}
	
	@Test(dependsOnMethods="navigateToSignUp" , alwaysRun=true)
	public void selectDropdown()   {
        List<WebElement> monthList=driver.findElements(By.xpath(month));
        for(WebElement ele : monthList)  
        {
        	String month=ele.getText();
        	System.out.println(month);
        	if(month.equalsIgnoreCase("aug"))
        	ele.click();
        } 
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	

}
