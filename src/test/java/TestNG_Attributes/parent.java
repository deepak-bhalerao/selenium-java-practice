package TestNG_Attributes;
import org.testng.annotations.*;

public class parent
{
	  @BeforeSuite
	  public void p1()
	  {
		  System.out.println("Before Suite");
	  }
	  @BeforeClass
	  public void p2()
	  {
		  System.out.println("Before Class");
	  }
	  @AfterSuite
	  public void p3()
	  {
		  System.out.println("After Suite");
	  }
	  @AfterClass
	  public void p4()
	  {
		  System.out.println("After Class");
	  }
}

class child 
 {
	    @BeforeClass
	    public void c1()
	    {
	  	  System.out.println("Before Class");
	    }
	    @BeforeTest
	    public void c2()
	    {
	   	  System.out.println("Before Test");
	    }
		@Test
		public void a1()
		{
	      System.out.println("a1 Test Method");
		}
		@Test
		public void A1()
		{
	      System.out.println("A1 Test Method");
		}
	    @AfterClass
	    public void c4()
	    {
	   	  System.out.println("After Class");
	    }
	    @AfterTest
	    public void c5()
	    {
	  	  System.out.println("After Test");
	    }
  }
