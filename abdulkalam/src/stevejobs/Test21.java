package stevejobs;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Test21
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Run browser driver to open browser                    
		System.setProperty("webdriver.chrome.driver",
				"E:\\batch235\\chromedriver.exe");
		//Create object to access opened browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Thread.sleep(5000);
		//Switch to frame
		driver.switchTo().frame("iframeResult");
		//select multiple items in drop-down
		WebElement e=driver.findElement(By.name("cars"));
		Select s=new Select(e);
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		a.click(s.getOptions().get(0)).build().perform();
		Thread.sleep(5000);
		a.click(s.getOptions().get(2)).build().perform();
		Thread.sleep(5000);
		a.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(15000);
		s.deselectByIndex(2);
	}
}




