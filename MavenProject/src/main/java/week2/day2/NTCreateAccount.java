package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(); //object created for the browser driver and to open a chrome browser
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//3. Click on Login Button using Class Locator
		driver.findElement(By.className	("decorativeSubmit")).click();
		//4. Click on CRM/SFA Link
		WebElement crm = driver.findElement(By.linkText("CRM/SFA"));
		crm.click();
		
		//5. Click on Accounts Button
		WebElement accounts = driver.findElement(By.linkText("Accounts"));
		accounts.click();
		  
		//6. Click on Create Account
		WebElement createAccount = driver.findElement(By.linkText("Create Account"));
		createAccount.click();
		
		//7. Select preferred currency as Indian Rupee using SelectByValue
		Select currency = new Select( driver.findElement(By.id("currencyUomId")));
		currency.selectByVisibleText("INR - Indian Rupee"); 
		//Add Account name
		driver.findElement(By.id("accountName")).sendKeys("Govi");
		//8. Enter the Description text as "NRI Account"
		driver.findElement(By.name("description")).sendKeys("CTR");
		
		//9. Enter LocalName Field Using Xpath Locator
		driver.findElement(By.id("groupNameLocal")).sendKeys("All goes well");
		
		  
		 //10. Enter SiteName Field Using Xpath Locator
		driver.findElement(By.id("officeSiteName")).sendKeys("All goes group perfect");
		 //11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		driver.findElement(By.xpath("//input[@id='annualRevenue']"));
		
		 
		 // 12. Select Industry as ComputerSoftware
		Select inds = new Select( driver.findElement(By.id("currencyUomId")));
		inds.selectByVisibleText("INR - Indian Rupee");
		//india.peace();
		
		
		 // 13. Select OwnerShip as S-Corporation using SelectByVisibletext
		 
		 // 14. Select Source as Employee using SelectByValue
		 
		// 15. Select Marketing Campaign as eCommerce Site Internal Campaign using
		 // SelectbyIndex
		  
		 //16. Select State/Province as Texas using SelectByValue
		
		// 17. Click on Create Account using Xpath Locator
		 
		// 18. Get the Text of Error Message Displayed (hint: Red Texts)
		//

	}

}
