package stevejobs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test31 
{
	public static void main(String[] args) throws Exception
	{
		//Run browser driver to open browser                    
		System.setProperty("webdriver.chrome.driver",
				 "E:\\batch235\\chromedriver.exe");
		//Create object to access that opened browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Create alert using javascript
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("alert('Launching completed');");
		Thread.sleep(10000);
		//Handle alerts
		driver.switchTo().alert().dismiss();
	}

}




