package TestWindowHandles;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {
	
	WebDriver driver;
	String originalWindow, newTab , childWindow;
	
	@BeforeClass
	public void SetUp() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions handleSSL=new ChromeOptions();
		driver=new ChromeDriver(handleSSL);
		driver.get("https://www.mastercard.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		originalWindow=driver.getWindowHandle();
		System.out.println('\n'+"Original window page title : "+driver.getTitle());
//		Thread.sleep(Duration.ofSeconds(2));
	}
	
	@Test
	public void switchWindow() throws InterruptedException
	{
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		newTab=driver.getWindowHandle();
		System.out.println("New tab page title : "+driver.getTitle());
//		Thread.sleep(Duration.ofSeconds(2));
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		childWindow=driver.getWindowHandle();
		System.out.println("Child window page title : "+driver.getTitle());
//		Thread.sleep(Duration.ofSeconds(2));
		
		// Loop through until we find a original window handle
		for(String windowHandle : driver.getWindowHandles())
			if(originalWindow.contentEquals(windowHandle))
				driver.switchTo().window(originalWindow);
        System.out.println("Original window after switch : "+driver.getTitle()+'\n');
//        Thread.sleep(Duration.ofSeconds(2));
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
	

}
