package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test37 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		//Run browser driver for browser
		System.setProperty("webdriver.chrome.driver",
				"E:\\batch235\\chromedriver.exe");
		//Create object to connect to browser
		WebDriver driver=new ChromeDriver(co);
		//Launch site
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);
		//Do login
		driver.findElement(By.name("userName"))
		                                .sendKeys("admin");
		Thread.sleep(5000);
		driver.findElement(By.name("password"))
		                          .sendKeys("katrinakaif");
		Thread.sleep(5000);
		driver.findElement(By.name("login")).click();
		
		

	}

}
