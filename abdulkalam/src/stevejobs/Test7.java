package stevejobs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 
{
	public static void main(String[] args) throws InterruptedException
	{
		//Run browser driver to open browser                    
		System.setProperty("webdriver.chrome.driver",
				      "E:\\batch235\\chromedriver.exe");
		//Create object to access that opened browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		//Get current page url
		String x=driver.getCurrentUrl();
		if(x.contains("https"))
		{
			System.out.println("Secured site");
		}
		else
		{
			System.out.println("Not a secured site");
		}
		//Close site
		driver.close();
	}
}
