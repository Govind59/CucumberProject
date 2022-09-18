package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert  {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(); //object created for the browser driver and to open a chrome browser
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.findElement(By.xpath("//i[contains(@class,'pi pi-globe')]")).click();
		
		driver.findElement(By.xpath("//span[text()='Alert']")).click();
		driver.findElement(By.xpath("(//span[contains (text(), 'Sho')])[1]")).click();
		Alert nm = driver.switchTo().alert();
		System.out.println(nm.getText());
		Thread.sleep(2000);
		nm.accept();
		
		driver.findElement(By.xpath("(//span[contains (text(), 'Sho')])[2]")).click();
		Alert cb = driver.switchTo().alert();
		System.out.println(cb.getText());
		Thread.sleep(2000);
		cb.accept();
		
		driver.findElement(By.xpath("(//span[contains (text(), 'Sho')])[5]")).click();
		
		Alert pb = driver.switchTo().alert();
		pb.sendKeys("Govind");
		System.out.println(pb.getText());
		Thread.sleep(2000);
		//pb.accept();
		

		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		Alert lb = driver.switchTo().alert();
		System.out.println(lb.getText());
		Thread.sleep(2000);
		lb.accept();
		//driver.close();
		
		

	}

}
