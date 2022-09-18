package PageObjectModel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public void getData(String excelFileName) throws IOException
	{
		XSSFWorkbook book = new XSSFWorkbook("./govind/downloads/row.xlsx");
		XSSFSheet sheet = book.getSheet("row");
		
		
	}
	

}
