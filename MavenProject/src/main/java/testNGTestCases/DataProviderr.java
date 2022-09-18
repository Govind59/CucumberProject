package testNGTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderr extends Launchsite {
	
	@Test(dataProvider="fetchvalues")
	public void demo(String fname,String lname)
	
		{
			driver.findElement(By.linkText("Create Lead")).click();
		
		}

	@DataProvider(name="fetchvalues")
	public String[][] testdata(){
	
		String[][] values = new String[2][4];
	
	
		values[0][0]="Test Leaf";
		values[0][1]="Test Leaf";
		values[0][2]="Test Leaf";
		values[0][3]="Test Leaf";
		
		
		return values;}
	
	
	
	
	

}
