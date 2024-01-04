package Selenium4_TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementScreenshot {
	
	@Test
	public void getElementScreenshot() throws IOException
	{
	     WebDriverManager.chromedriver().setup();
	     System.setProperty("webdriver.http.factory", "jdk-http-client");
	     
	     // to handle ssl certification
	     ChromeOptions handleSSL=new ChromeOptions();
	     handleSSL.setAcceptInsecureCerts(true);
	     
//	     ChromeDriver driver=new ChromeDriver();
	     
	     WebDriver driver=new ChromeDriver(handleSSL);
	     
	     driver.get("https://www.mi.com/in");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	     
	     WebElement logo=driver.findElement(By.xpath("//a[@class='logo__link']"));
	     File src=logo.getScreenshotAs(OutputType.FILE);
	     File dest=new File(System.getProperty("user.dir")+"/ScreenShots/ElementLogo.png");
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
