package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LEarnFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(); //object created for the browser driver and to open a chrome browser
		driver.get("http://amazon.in");		
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("IPhone", Keys.ENTER);
		//find Iphones with the memory 128GB
		
		List<WebElement> mobilenames = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (WebElement eachmobile : mobilenames) {
			String phoneMemory= eachmobile.getText();
			
			if(phoneMemory.contains	("128GB")) {
				System.out.println(phoneMemory);	
			}
			
			
		}
		
		
	}

}
