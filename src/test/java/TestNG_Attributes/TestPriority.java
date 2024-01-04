package TestNG_Attributes;

import org.testng.annotations.Test;

public class TestPriority {
	
	@Test(priority = 1)
	public void MethodOne() {
		System.out.println('\n'+"Method One");
	}
	
	@Test(priority = 2)
	public void MethodTwo() {
		System.out.println("Method Two"+'\n');
	}
	
	@Test(priority = -1)
	public void MethodThree() {
		System.out.println("Method Three");
	}
	
	@Test(priority = -2)
	public void MethodFour() {
		System.out.println('\n'+"Method Four");
	}

}
