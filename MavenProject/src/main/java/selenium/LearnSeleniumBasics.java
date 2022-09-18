package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(); //object created for the browser driver and to open a chrome browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().maximize();
		driver.findElement(By.id("Username"));
		driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);
		
		
	}

}
