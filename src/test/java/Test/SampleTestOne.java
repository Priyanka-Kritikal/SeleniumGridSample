package Test;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BrowserFactory;

public class SampleTestOne extends BrowserFactory {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() throws MalformedURLException
	{
		 driver = initializebrowser("edge");
	}
	
	
	


	@Test
	public void Testtwo()
	{
		driver.get("http://the-internet.herokuapp.com/");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}