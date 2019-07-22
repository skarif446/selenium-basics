package stevejobs;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;
public class Test4 
{
	public static void main(String[] args) throws Exception 
	{
		//Open browser using browser driver
		System.setProperty("webdriver.chrome.driver",
				"E:\\batch235\\chromedriver.exe");
		//Connect to browser using driver object
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get(
				"http://site21.way2sms.com/content/index.html");
		Thread.sleep(5000);
		//Do login
		driver.findElement(By.name("username"))
		                           .sendKeys("8121450829");
		driver.findElement(By.name("password"))
		                            .sendKeys("09021993");
		driver.findElement(By.id("loginBTN")).click();
		Thread.sleep(5000);
		//Send sms
		driver.findElement(By.xpath("//*[text()='Send SMS']"))
		                                             .click();
		Thread.sleep(5000);
		driver.switchTo().frame("frame");
		driver.findElement(By.name("mobile"))
		                              .sendKeys("9705668146");
		driver.findElement(By.name("message"))
		         .sendKeys("Amma nanna one testing job..etc");
		driver.findElement(By.name("Send")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		if(driver.findElement(By.xpath(
		  "//*[text()='Install Chrome Plugin']")).isDisplayed())
		{
			driver.findElement(By.xpath(
				"//*[text()='Install Chrome Plugin']")).click();
			Thread.sleep(5000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(5000);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(5000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(10000);
		}	
		//Switch to frame
		driver.switchTo().frame("frame");
		String msg=driver.findElement(By.xpath(
				"//*[@class='mess']/child::*[2]")).getText();
		System.out.println(msg);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@class='out louti']"))
		                                              .click();
		Thread.sleep(5000);
		driver.close();
	}
}





