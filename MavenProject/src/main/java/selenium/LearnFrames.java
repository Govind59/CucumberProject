package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(); //object created for the browser driver and to open a chrome browser
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		Thread.sleep(2000);
		//WebElement frame = driver.findElement(By.xpath("(//iframe[contains(@src, 'selectable')]"));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//li[text()='Item 3']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Download']")).click();
		System.out.println(driver.getTitle());
		
		

	}

}
