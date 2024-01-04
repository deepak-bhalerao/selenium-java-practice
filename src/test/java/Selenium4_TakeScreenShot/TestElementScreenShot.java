package Selenium4_TakeScreenShot;
import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestElementScreenShot {
	
	@Test
	public void getElementScreenShot()
	{
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions handleSSL=new ChromeOptions();
		handleSSL.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(handleSSL);
		
		driver.get("https://www.mastercard.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//button[text()='Accept cookies']")).click();
		
		// Takes Element ScreenShot
		WebElement logo = driver.findElement(By.xpath("//a[@title='MC Logo']"));
		File src = logo.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"/Screenshot/SingleElement.png");
		try
		{
			FileHandler.copy(src, dest);
			System.out.println('\n'+"ScreenShot Gets Captured.."+'\n');
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		WebElement link = driver.findElement(By.xpath("(//span[@class='nav-item h5'])[1]"));
		link.click();
		
		// Explicit Wait 
		WebElement findACard = driver.findElement(By.xpath("//span[text()='Find a card']"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(findACard));
		
		findACard.click();
		
		// Takes Section ScreenShot
		WebElement section = driver.findElement(By.xpath("//div[@class='image-container dxp-flex-grow-1']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(section));
		File source=section.getScreenshotAs(OutputType.FILE);
		File destination=new File(System.getProperty("user.dir")+"/Screenshot/Section.png");
		try
		{
			FileHandler.copy(source, destination);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		driver.quit();
		
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		for(WebElement webLink : links)
//			System.out.println(webLink.getText());
		
	
	}

}
