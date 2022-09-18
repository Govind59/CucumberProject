package testNGTestCases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
		public static String[][] leadDatas() throws IOException {
	
			//step1 :
			XSSFWorkbook book =new XSSFWorkbook("./data/test.xlsx");
			
			//step2:
			XSSFSheet sheet= book.getSheetAt(0);
			
			//step:3
			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			
			//Step:4
			
			int getLastColumn = sheet.getLastRowNum();
			
			//Step:to get the row count	
			
			int rowCount = sheet.getLastRowNum();
			int colCount = sheet.getRow(1).getLastCellNum();
			//to integrate the excel data with the dataprovider
			
			String[][] data = new String[rowCount][colCount];
			
			for(int i=1;i<=rowCount;i++)
			{
				for(int j=0;j<colCount;j++)
				{
					String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
					data[i-1][j]=stringCellValue;
				}
			}
			
			book.close();
			return data;
			
		}
}
