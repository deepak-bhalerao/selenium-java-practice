package Utility;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	static WebDriver driver;
	
//	public Base(WebDriver ldriver)
//	{
//		this.rdriver=ldriver;
//	}
	
	@BeforeClass	
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions handleSSL=new ChromeOptions();
		handleSSL.setAcceptInsecureCerts(true);
		driver=new ChromeDriver(handleSSL);
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,500)");
//		driver.findElement(By.id("month")).click();
	}
	
	public void selectTitle(String title , String xpath) throws InterruptedException
	{
		WebElement month=driver.findElement(By.xpath(xpath));
		Select select=new Select(month);
		select.selectByVisibleText(title);
//		Thread.sleep(Duration.ofSeconds(2));
	}
	
	public void selectTitle(int index , String xpath) throws InterruptedException
	{
		WebElement ele=driver.findElement(By.xpath(xpath));
		Select sel=new Select(ele);
		sel.selectByIndex(index);
//		Thread.sleep(Duration.ofSeconds(2));
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
