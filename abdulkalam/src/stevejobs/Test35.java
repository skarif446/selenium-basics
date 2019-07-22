package stevejobs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test35
{
	public static void main(String[] args) throws InterruptedException 
	{
		DesiredCapabilities c=new DesiredCapabilities();
		c.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//Run browser driver to open browser                    
		System.setProperty("webdriver.chrome.driver",
				 "E:\\batch235\\chromedriver.exe");
		//Create object to access that opened browser
		WebDriver driver=new ChromeDriver(c);
		//Launch site
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		

	}

}
