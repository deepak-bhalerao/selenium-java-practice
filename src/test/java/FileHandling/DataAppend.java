package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class DataAppend {
	
	@Test
	public void TestDataAppend() throws Exception
	{
		// If we want to override data to the file then no need to pass boolean
		// parameter in file path bcos by default it will set false
		// But if we want to append data with existing data in file then compulsary 
		// we need to use boolean parameter as true in file path 
		
		try {
			FileWriter file=new FileWriter("C:\\TestJava\\FileDataAppend.txt",true);
			file.append(" Maharashtra ");
			file.close();
			System.out.println("Data Append Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
