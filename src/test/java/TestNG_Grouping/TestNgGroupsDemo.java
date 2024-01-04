package TestNG_Grouping;
import org.testng.annotations.Test;

@Test(groups = {"AllClassTests"} )
public class TestNgGroupsDemo 
{
	
	@Test(groups = {"Smoke"} )
	public void TestOne()  {
		System.out.println("This is Test One ");  }
	
	@Test(groups= {"Smoke","Sanity"} )
	public void TestTwo()  {
		System.out.println("This is Test Two ");  }
	
	@Test(groups = {"Sanity","Regression"})
	public void TestThree() {
		System.out.println("This is Test Three ");  }
	
	@Test(groups = {"Regression"} )
	public void TestFour()  {
		System.out.println("This is Test Four ");  }
	
	@Test
	public void TestFive()  {
		System.out.println("This is Test Five ");  }

}
