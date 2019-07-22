package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test24 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Run browser driver to open browser                    
		System.setProperty("webdriver.chrome.driver",
					"E:\\batch235\\chromedriver.exe");
		//Create object to access opened browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Automate auto-complete element
		WebElement e=driver.findElement(By.name("q"));
		Actions a=new Actions(driver);
		a.sendKeys(e,"abdul kalam").build().perform();
		Thread.sleep(5000);
		while(2>1)  //infinite loop
		{
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(2000);
			String x=e.getAttribute("value");
			if(x.equalsIgnoreCase("abdul kalam thoughts"))
			{
				a.sendKeys(Keys.ENTER).build().perform();
				break; //terminate from loop
			}
		}

	}

}




