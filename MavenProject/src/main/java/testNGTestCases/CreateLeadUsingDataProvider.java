package testNGTestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CreateLeadUsingDataProvider extends Launchsite{
	
		@Test(dataProvider="fetchclass")
		public void readexceldp()
		{
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Company");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(username);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(password);
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
			driver.findElement(By.name("submitButton")).click();
		}
		
		@DataProvider(name="fetchclass")
		public String[][] testData() throws IOException
		{
			ReadExcel obj=new ReadExcel();
			ReadExcel.leadDatas();
			String[][] leadDatas=obj.leadDatas();
			return leadDatas;
		}
}
