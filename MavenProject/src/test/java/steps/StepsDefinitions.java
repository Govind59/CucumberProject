package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsDefinitions extends BaseClass {
	
			
	@Then("Homepage should be displayed")
	public  void verifyHomePage() 
	{
		//booleatrn 

	}
	
	@And("Quit")
	public void closeBrowser()
	{
		driver.quit();
	}
}
