package stevejobs;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test10
{
	public static void main(String[] args) throws Exception
	{
		//Run browser driver to open browser                    
		System.setProperty("webdriver.chrome.driver",
					"E:\\batch235\\chromedriver.exe");
		//Create object to access opened browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get(
				"http://site24.way2sms.com/content/index.html");
		Thread.sleep(5000);
		//Click on google play button
		driver.findElement(By.xpath(
		   "//*[contains(@src,'android-button.png')]")).click();
		Thread.sleep(5000);
		//Get browser window/tab handles
		ArrayList<String> a=new 
				ArrayList<String>(driver.getWindowHandles());
		//Switch to 2nd browser window/tab
		driver.switchTo().window(a.get(1));
		driver.close();
		Thread.sleep(5000);
		//Switch back to 1st browser window/tab
		driver.switchTo().window(a.get(0));
		driver.findElement(By.name("username"))
										.sendKeys("8121450829");
		driver.findElement(By.name("password"))
										.sendKeys("09021993");
		driver.findElement(By.id("loginBTN")).click();
		Thread.sleep(5000);
	}

}




