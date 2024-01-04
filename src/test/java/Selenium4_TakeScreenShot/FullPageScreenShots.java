package Selenium4_TakeScreenShot;
import java.io.File;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FullPageScreenShots {
	
	@Test
	public void getFullPageScreenshot()
	{
		
		WebDriverManager.firefoxdriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.mi.com/in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		File src= ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"/ScreenShots/FullPageScreenShots.png");
		
		try
		{
			FileHandler.copy(src, dest);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		driver.quit();
		
	}
}
