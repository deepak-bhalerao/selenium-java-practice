 package DataHandling;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelData 
{
    @Test
	public void getExcelData() throws IOException
	{
		// FileInputStream class used to read the data from file   
		
		FileInputStream fis=new FileInputStream("TestData1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		System.out.println("Test Data in Excel Sheet..."+'\n');
		
		int rows = sheet.getLastRowNum();  // it will read till last row of excel
		short colm = sheet.getRow(1).getLastCellNum(); // it will read till last cell of row
		
		for(int r=0 ; r<=rows ; r++)    // outer for loop represent the number of rows
		{
			XSSFRow row = sheet.getRow(r);
			for(int c=0 ; c<colm ; c++)   // inner for loop represent the number of columns
			{
				XSSFCell cell = row.getCell(c);
				switch(cell.getCellType())
				{
				case STRING: System.out.print(cell.getStringCellValue()); break;
				case NUMERIC: System.out.print(cell.getNumericCellValue()); break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
		System.out.println();
		
			
	}
	
	
}
