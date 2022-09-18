
package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksImplementation {
	
		@Before
		public void precondition()
		{
			//open chromebrowser
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(); //object created for the browser driver and to open a chrome browser
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
		}

		@After
		public void postcondition()
		{
			driver.close();
		}
}
