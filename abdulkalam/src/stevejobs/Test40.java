package stevejobs;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;
public class Test40 
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
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//Do login
		driver.findElement(By.name("identifier"))
		                  .sendKeys("shafi.automation");
		driver.findElement(By.id("identifierNext"))
		                    .click();
		Thread.sleep(5000);
		driver.findElement(By.name("password"))
        				.sendKeys("Seleniumcode");
		driver.findElement(By.id("passwordNext"))
          				.click();
		Thread.sleep(5000);
		//Click Compose
		driver.findElement(
				By.xpath("//*[text()='COMPOSE']")).click();
		Thread.sleep(5000);
		//Fill fields in compose page
		driver.findElement(By.name("to"))
		                   .sendKeys("apj@abdulkalam.com");
		driver.findElement(By.name("subjectbox"))
		                   .sendKeys("B'day wishes");
		driver.findElement(By.xpath(
				"(//*[@aria-label='Message Body'])[2]"))
				.sendKeys("Hi sir,\nHappy B'day to you,\nBye");
		driver.findElement(By.xpath(
		 "//*[@aria-label='Attach files']/descendant::*[3]"
				)).click();
		Thread.sleep(5000);
		//Handle file upload window(Java Robot)
		StringSelection x=new StringSelection(
		"C:\\Users\\Public\\Pictures\\Sample Pictures\\tulips.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard()
		                              .setContents(x,null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(15000);
		//Send mail
		driver.findElement(By.xpath("//*[text()='Send']"))
													.click();
		Thread.sleep(5000);
		//Get output msg
		String y=driver.findElement(By.xpath(
				"(//*[@role='alert'])[1]/descendant::*[3]"))
				.getText();
		System.out.println(y);
		//Do logout
		driver.findElement(By.xpath(
		 "//*[contains(@title,'Google Account:')]/child::*"))
		 .click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);
		//Close site
		driver.close();
		
		
		
		
		
		

	}

}








