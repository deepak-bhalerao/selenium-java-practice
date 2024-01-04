package TestNG_Attributes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_TestAttributes {
	
	
	@BeforeTest
	public void test()
	{
		System.out.println("This is BeforeTest Method");
	}
	
	@BeforeMethod
	public void test1()
	{
		System.out.println("This is BeforeMethod ");
	}
	
	@Test(enabled=false)
	public void testMain()
	{
		System.out.println("This is Test enabled = true method");
	}
	
	@Test(invocationCount=1)
	public void test2()
	{
		System.out.println("This is Test invocationCount Method");
	}
	
	@BeforeSuite
	public void setup()
	{
		System.out.println('\n'+"This is BeforeSuite method");
	}
	
	@BeforeClass
	public void setup1()
	{
		System.out.println("This is BeforeClass method");
	}
	
	@AfterMethod
	public void test3()
	{
		System.out.println("This is AfterMethod ");
	}
	
	@AfterClass
	public void test4()
	{
		System.out.println("This is AfterClass Method ");
	}
	
	@AfterTest
	public void test5()
	{
		System.out.println("This is AfterTest Method "+'\n');
	}
	
	@AfterSuite
	public void CloseSetup()
	{
		System.out.println("This is AfterSuite Method "+'\n');
	}
}
