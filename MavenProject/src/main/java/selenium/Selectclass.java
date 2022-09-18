package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(); //object created for the browser driver and to open a chrome browser
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println(driver.manage().window().getSize());
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className	("decorativeSubmit")).click();
		WebElement crm = driver.findElement(By.linkText("CRM/SFA"));
		crm.click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		WebElement Cname=driver.findElement(By.id("createLeadForm_companyName"));
		Cname.sendKeys("Prophoenix");			
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Govind");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KG");
		//driver.findElement(By.name("submitButton")).click();
		
		
		WebElement source= driver.findElement(By.id("createLeadForm_dataSourceId"));
		WebElement mkt= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		WebElement ind= driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select  s = new Select(source);
		Select s1 = new Select (mkt); 
		Select s2 = new Select (ind);
		s.selectByIndex(2);
		s1.selectByVisibleText("Catalog Generating Marketing Campaigns");
		s2.selectByValue("IND_AEROSPACE");
		
		
		
	}

}
