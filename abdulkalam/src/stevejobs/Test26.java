package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test26
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Run browser driver to open browser                    
		System.setProperty("webdriver.chrome.driver",
					"E:\\batch235\\chromedriver.exe");
		//Create object to access that opened browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Switch to frame
		driver.switchTo().frame(0); //single frame in page
		//Automate Horizontal slider
		WebElement e1=driver.findElement(By.xpath(
				            "//*[@id='slider']/child::*"));
		int x1=e1.getLocation().getX();
		int y1=e1.getLocation().getY();
		Actions a=new Actions(driver);
		a.dragAndDropBy(e1,x1+150,y1).build().perform();
		Thread.sleep(10000);
		a.dragAndDropBy(e1,x1-150,y1).build().perform();
		Thread.sleep(10000);
		//Back to page level and click a link
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Vertical slider"))
		                                          .click();
		Thread.sleep(5000);
		//Switch to frame
		driver.switchTo().frame(0); //single frame in page
		//Automate Vertical slider
		WebElement e2=driver.findElement(By.xpath(
				  "//*[@id='slider-vertical']/child::*[2]"));
		int x2=e2.getLocation().getX();
		int y2=e2.getLocation().getY();
		a.dragAndDropBy(e2,x2,y2+50).build().perform();
		Thread.sleep(5000);
		a.dragAndDropBy(e2, x2,y2-150).build().perform();
		
		

	}

}
