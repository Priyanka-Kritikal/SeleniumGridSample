package base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.http.ClientConfig;
 

public class BrowserFactory {
	
	public WebDriver initializebrowser(String Browser) throws MalformedURLException
	{
		 WebDriver driver;
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		if(Browser.equals("chrome"))
		{
			
			dc.setBrowserName("chrome");
		
		}
		else if (Browser.equals("edge"))
		{
			
			dc.setBrowserName("MicrosoftEdge");
			
		}
		else if(Browser.equals("firefox"))
		{
		
			dc.setBrowserName("firefox");
		
			
		}
		 
		driver = new RemoteWebDriver(new URL(" http://localhost:4444"), dc);
		return driver;
	}

}
