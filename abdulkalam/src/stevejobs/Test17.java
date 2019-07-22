package stevejobs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test17
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Run browser driver to open browser                    
		System.setProperty("webdriver.chrome.driver",
				"E:\\batch235\\chromedriver.exe");
		//Create object to access opened browser
		WebDriver driver=new ChromeDriver();
		//Delete existing cookies
		driver.manage().deleteAllCookies();
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//Cookies testing
		if(driver.manage().getCookies().size()!=0)
		{
			System.out.println("Cookies were loaded");
		}
		else
		{
			System.out.println("Cookies were not loaded");
		}
		//Close site
		driver.close();
	}
}


