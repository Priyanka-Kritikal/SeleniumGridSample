package Test;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BrowserFactory;

public class SampleTesttwo extends BrowserFactory {
	
	public WebDriver driver;
	

	@Test
	public void Testthree()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		driver.get("http://the-internet.herokuapp.com/");
	}
	
	@BeforeMethod
	public void setup() throws MalformedURLException
	{
		 driver = initializebrowser("firefox");
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}