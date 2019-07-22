package stevejobs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test20
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
		//test drop-down
		WebElement e=driver.findElement(By.name("cars"));
		Select s=new Select(e);
		if(s.isMultiple())
		{
			System.out.println("Multi-select");
		}
		else
		{
			System.out.println("Single-select");
		}
		//Close site
		driver.close();

	}

}




