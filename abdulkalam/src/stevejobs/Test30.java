package stevejobs;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test30 
{
	public static void main(String[] args) throws Exception
	{
		//Run browser driver to open browser                    
		System.setProperty("webdriver.chrome.driver",
						"E:\\batch235\\chromedriver.exe");
		//Create object to access that opened browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Page Scroll down using javascript
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		//Page Scroll up using javascript
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(5000);
		//Page Scrolling for given element using javascript
		WebElement e=driver.findElement(By.xpath("//*[text()='Select Language']/preceding-sibling::*[1]"));
		js.executeScript("arguments[0].scrollIntoView();",e);
	}

}






