package Utility;

import org.testng.annotations.Test;


public class TestOverloading extends Base {

	Base bs=new Base();
	static String date="//select[@id='day']";
	static String month="//select[@id='month']";
	static String year="//select[@id='year']";
	
	
	@Test
	public void SelectDOB() throws InterruptedException
	{
		bs.selectTitle("2",date);            
		bs.selectTitle("Mar",month);  // passing visible text as string parameter
		bs.selectTitle(31,year);      // passing index value as int parameter
		
		// We have achieved method overloading here because we are calling same method
		// with different parameters
	}

}
