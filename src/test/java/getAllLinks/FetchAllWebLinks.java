package getAllLinks;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchAllWebLinks {
	
	WebDriver driver;
	
	@Test
	public void SetLinks()
	{
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		// To handle SSL certification code 
		// We can create an object of ChromeOptions class
		ChromeOptions handlingSSL=new ChromeOptions();
        // We pass the parameter as true, which means the invalid certificate will be trusted implicitly by the browser.
		handlingSSL.setAcceptInsecureCerts(true);
		
		driver=new ChromeDriver(handlingSSL);
		driver.navigate().to("https://www.amazon.in/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		// Get all the available Links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		// Iterating through all the Links and printing link text
		for(WebElement webLinks : links)
			
		   System.out.println(webLinks.getText());

	}

}
