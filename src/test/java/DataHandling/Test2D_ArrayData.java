package DataHandling;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2D_ArrayData 
{
	
	@Test(dataProvider="passData")
	public void getData(String empName,int empId)
	{
		System.out.println('\n'+empName+" "+empId+'\n');
	}
	
	@DataProvider
	public Object[][] passData()
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="HarryPotter";
		data[0][1]=102;
		
		data[1][0]="HareshPrajapati";
		data[1][1]=101;
		
		data[2][0]="DeepakBhalerao";
		data[2][1]=103;
		return data;
	}

}
