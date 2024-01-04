package DynamicWebTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyDynamicWebTable 
{
	
	public static WebDriver driver;
	
	String tableData="(//table[@id='product'])[2]//td";
	String tableHeader="(//table[@id='product'])[2]//th";
	String tableRows="(//table[@id='product'])[2]//tr";
	String cityColumn="(//table[@id='product'])[2]//td[3]";
	String positionColumn="(//table[@id='product'])[2]//td[2]";
	String firstRow="((//table[@id='product'])[2]//tr)[2]";
	
	@Test
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	}
	
	@Test(dependsOnMethods="setUp", priority=2)
	public void VerifyTableHeaders()
	{
		List<WebElement> headers=driver.findElements(By.xpath(tableHeader));
		for(WebElement ele : headers)  
		{
			String str = ele.getText();
			System.out.println("Table Headers : "+str);  
			}	
	}
	
	@Test(dependsOnMethods="setUp" ,alwaysRun=true ,priority=3)
	public void VerifyCityColumn()
	{
		List<WebElement> column=driver.findElements(By.xpath(cityColumn));
		for(WebElement el : column) {
			String str = el.getText();
			System.out.println("City Column : "+str);  }		
	}
	
	@Test(priority=4 , enabled=true)
	public void VerifyPositionColumn()
	{
		List<WebElement> pos=driver.findElements(By.xpath(positionColumn));
		for(WebElement ele : pos) {
			String str = ele.getText();
			System.out.println("Position Column : "+str);  }
	}
	
	@Test(priority=1 , enabled=false)
    public void verifyFirstRecord()
    {
		List<WebElement> firstRecord=driver.findElements(By.xpath(firstRow));
		for(WebElement el : firstRecord) {
			String str = el.getText();
			System.out.println("First Record : "+str);  }
    }
	
	@AfterTest
	public void tearDown()
	{
	   driver.quit();	
	}
	

}
