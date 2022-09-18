package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LearnWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("Webdriver.chrome.driver","C:\\downloads;");
		//WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(); //object created for the browser driver and to open a chrome browser
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
			
		String CurrentID = driver.getWindowHandle();
		System.out.println(CurrentID + "0");
		Thread.sleep(3000);
		//driver.findElement(By.id("home")).click();
		
		driver.findElement(By.xpath("//button[@id='j_idt88:new']")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows + "1");
		
				
		for (String window : allWindows) {
		
		//List<WebElement> list = new ArrayList<WebElement>();
		driver.switchTo().window(window);
		
		System.out.println(driver.getCurrentUrl()+ "2");
		driver.switchTo().defaultContent();
		System.out.println(driver.getCurrentUrl()+ "3");}
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
