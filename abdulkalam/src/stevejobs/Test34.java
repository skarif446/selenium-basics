package stevejobs;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
public class Test34
{
	public static void main(String[] args) throws Exception
	{
		//Run browser driver to open browser                    
		System.setProperty("webdriver.chrome.driver",
				 "E:\\batch235\\chromedriver.exe");
		//Create object to access that opened browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Click a link and wait for complete operation
		driver.findElement(By.linkText("4")).click();
		Wait w=new FluentWait(driver)
		       .withTimeout(100,TimeUnit.SECONDS)
		       .pollingEvery(2, TimeUnit.SECONDS);
		w.until(ExpectedConditions.
		   invisibilityOfElementLocated(By.className("raDiv")));
		//Close site
		driver.close();
	}
}





