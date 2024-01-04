package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestJavascriptExecutor {
	
	@Test
	public void TestJSExecutor() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions handlessl=new ChromeOptions();
		handlessl.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(handlessl);
	
		driver.get("https://apple.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
//		Thread.sleep(Duration.ofSeconds(5));
				
		// Javascript executor is interface which is used to run JavaScript
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		// Example 1. JavascriptExecutor in Selenium to refresh the browser window
		js.executeScript("location.reload()");
		
		// Example 2. JavascriptExecutor in Selenium to send text
		js.executeScript("document.getElementByID('elementID').value='ABC';");
		
		// Example 3. Generate Alert Pop Window
		js.executeScript("alert('Hey Hi Haresh This Side')");	
		
		// Example 4. Get InnerText of a Webpage
		String sText =  js.executeScript("return document.documentElement.innerText;").toString();
        System.out.println(sText);
        System.out.println();
        
        // Example 5. Get Title of a WebPage
        String title =  js.executeScript("return document.title;").toString();
        System.out.println(title);
        
        // Example 6. Scroll Page 
        js.executeScript("window.scrollBy(500)");     // Vertical scroll – down by 500  pixels
//		Thread.sleep(Duration.ofSeconds(5));
		
		// Example 7. Browser back and forward
		js.executeScript("history.go(-1)");   // Browser Back
		js.executeScript("history.go(1)");    // Browser Forward
		// OR
		js.executeScript("window.history.go(-1)");   // Browser Back
		js.executeScript("window.history.go(1)");	 // Browser Forward	 
		
		driver.quit();
	}

}
