package DataHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TestExcelDataIterator {

	
	@Test
	public void  TestDataIterator() throws IOException {
		
		FileInputStream fis=new FileInputStream("TestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row> itr = sheet.rowIterator();
		while(itr.hasNext())
		{
			XSSFRow row = (XSSFRow) itr.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			
			while(cellIterator.hasNext())
			{
				XSSFCell cell = (XSSFCell) cellIterator.next();
				switch(cell.getCellType())
				{
				case STRING:System.out.print(cell.getStringCellValue()); break;
				case NUMERIC: System.out.print(cell.getNumericCellValue()); break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
				
		
	}

}
