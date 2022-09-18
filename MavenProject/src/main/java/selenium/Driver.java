package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	
		public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(); //object created for the browser driver and to open a chrome browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().maximize();
		
	}
}