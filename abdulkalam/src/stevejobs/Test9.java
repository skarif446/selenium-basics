package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9
{
	public static void main(String[] args) throws InterruptedException
	{
		//Open browser using browser driver
		System.setProperty("webdriver.chrome.driver",
				"E:\\batch235\\chromedriver.exe");
		//Connect to browser using driver object
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://site21.way2sms.com/content/index.html");
		Thread.sleep(5000);
		//Do login
		driver.findElement(By.name("username")).sendKeys("8121450829");
		driver.findElement(By.id("loginBTN")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	}

}





