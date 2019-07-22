package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test22
{
	public static void main(String[] args) throws Exception
	{
		//Run browser driver to open browser                    
		System.setProperty("webdriver.chrome.driver",
				   "E:\\batch235\\chromedriver.exe");
		//Create object to access opened browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Move mouse pointer to Women link
		WebElement e=driver.findElement(By.xpath(
				           "//*[text()='Women']"));
		Actions a=new Actions(driver);
		a.moveToElement(e).build().perform();
		Thread.sleep(10000);
		a.contextClick(e).build().perform();
		
		
		

	}

}
