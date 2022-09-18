package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(); //object created for the browser driver and to open a chrome browser
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
		System.out.println(driver.manage().window().getSize());
		
		List<String> list = new ArrayList();
		//Getting table from the webpage
		WebElement elementtable =driver.findElement(By.tagName("table"));
		//Getting the rows from the table
		List<WebElement> rows= elementtable.findElements(By.tagName("tr"));
		// Iteration each rows in the table
		for(int i=0;i<=rows.size();i++) {
			//From the iteration each row
			WebElement eachrow=rows.get(i);
			List<WebElement> cols = elementtable.findElements(By.tagName("td"));
			//Iterating cols to get out of it
			for(int j=0;j<=cols.size();j++) {
				
				list.add(cols.get(j).getText());
				System.out.println(list);
				//System.out.println(cols.get(j).getText());
				
				
			}
		}

	}

}
