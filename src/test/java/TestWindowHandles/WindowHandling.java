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

public class WindowHandling {
	
	WebDriver driver;
	String originalWindow ,newTabParentWindow, childWindow ;
	
	@BeforeClass
	public void setUp() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions handlessl=new ChromeOptions();
		driver=new ChromeDriver(handlessl);
		driver.get("https://www.apple.com/in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		originalWindow=driver.getWindowHandle();
		System.out.println();
		System.out.println("Original Window Page Title : "+driver.getTitle());
//		Thread.sleep(Duration.ofSeconds(2));
	}
	
	@Test
	public void switchToOriginalWindow() throws InterruptedException
	{
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.samsung.com/global/galaxy/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		newTabParentWindow=driver.getWindowHandle();
		System.out.println("New Tab Page Title : "+driver.getTitle());
//		Thread.sleep(Duration.ofSeconds(2));
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.mi.com/in");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		childWindow=driver.getWindowHandle();
		System.out.println("New Window Page Title : "+driver.getTitle());
//		Thread.sleep(Duration.ofSeconds(2));
		
		// Loop through until we find a original window handle
		for(String windowHandle : driver.getWindowHandles())
			if(originalWindow.contentEquals(windowHandle))
				driver.switchTo().window(originalWindow);
		System.out.println("Original Window After Switch : "+driver.getTitle());
//		Thread.sleep(Duration.ofSeconds(2));
		
		for(String windowHandle : driver.getWindowHandles())
			if(newTabParentWindow.contentEquals(windowHandle))
				driver.switchTo().window(newTabParentWindow);
		System.out.println("Parent Window New Tab after switch : "+driver.getTitle());
//		Thread.sleep(Duration.ofSeconds(2));
		
		for(String windowHandle : driver.getWindowHandles())
			if(childWindow.contentEquals(windowHandle))
				driver.switchTo().window(windowHandle);
		System.out.println("Again child window after switch : "+driver.getTitle());
		System.out.println();
	}

	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
	
//	@Test
//	public void getAllLinks()
//	{
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		for(WebElement webLink : links)
//			System.out.println("Web Links are : "+webLink.getText());
//	}

}
