package week2.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//Week2.day2 assignment

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	

		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver(); //object created for the browser driver and to open a chrome browser
			driver.manage().window().maximize();
			//1. Launch URL "http://leaftaps.com/opentaps/control/main"
			driver.get("http://leaftaps.com/opentaps/control/main");
			//2. Enter UserName and Password Using Id Locator
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
			//3. Click on Login Button using Class Locator
			driver.findElement(By.className	("decorativeSubmit")).click();
			//4. Click on CRM/SFA Link
			WebElement crm = driver.findElement(By.linkText("CRM/SFA"));
			crm.click();
			//5. Click on Leads
			driver.findElement(By.linkText("Leads")).click();
			Thread.sleep(2000);
			//7. Click Find leads
			driver.findElement(By.linkText("Find Leads")).click();	
			//8. Click on Phone
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			//input[@id='ext-gen262']
			//9. Enter phone number
			WebElement phone=driver.findElement(By.xpath("//input[@name='phoneCountryCode']"));
			phone.clear();
			phone.sendKeys("2");
			//10. Click find leads button
			driver.findElement(By.xpath("//td//td//em//button[@id='ext-gen334']")).click();
			//11. Capture lead ID of First Resulting lead;
			WebElement tab= driver.findElement(By.xpath("//div[@id='ext-gen990']"));
			tab.click();
		    int rowCount = driver.findElements(By.xpath("//table[@class='x-grid3-row-table']//tr")).size();
		    int colCount = driver.findElements(By.xpath("//table[@class='x-grid3-row-table']//td")).size();
		    System.out.println(rowCount +":"+ colCount);
		/*    for(int i=2;i<=rowCount;i++)
		    {
		    	for(int j=1;j<=colCount	;j++)
		    	{
		    		if(i==2 && j==1) {
		    		String actValue=driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[1]//tr[i]//td[j]")).getText();
		    		System.out.println("actValue");
		    		System.out.println(actValue + "ok");
		    		
		    		}
		    	}
		    }*/
		   /* List<WebElement> columns=rows.get(rnum).findElements(By.tagName("th"));
		    System.out.println("Number of columns:"+columns.size());
		     
		    for(int cnum=1;cnum<columns.size();cnum++)
		    {
		    System.out.println(columns.get(cnum).getText());
		    }
		    }*/
		    //driver.close();
			
			
			
			//12. Click First Resulting lead
			
			//13. Click Delete
			//14. Click Find leads
			//15. Enter captured lead ID
			//16. Click find leads button
			//17. Verify message "No records to display" in the Lead List. This message confirms the successful deletion
			//18. Close the browser (Do not log out)


		}
	

}
