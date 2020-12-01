package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
		
		
		// Open Workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/ExcelFile.xlsx");
		
		// Get Sheet
		XSSFSheet sheet = wb.getSheet("MM");
		
		// Row count
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		
		//Column Count
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		
				
		//open "for loop" for rows
		for (int i = 1; i <= rowCount; i++) {
			// Get Row
			XSSFRow row = sheet.getRow(i);
			
			//open "for loop" for  columns
			for (int j = 0; j < columnCount; j++) {
				//Get Column
				XSSFCell cell = row.getCell(j);
				
				//Action -> Read Value
				String value = cell.getStringCellValue();
				System.out.println(value);
			
			} //Ends column for loop
		
		}//Ends row for loop
		
	}

}
