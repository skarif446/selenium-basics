package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test29
{
	public static void main(String[] args) throws Exception
	{
		//Run browser driver to open browser                    
		System.setProperty("webdriver.chrome.driver",
				 "E:\\batch235\\chromedriver.exe");
		//Create object to access that opened browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Fill userid using javascript
		WebElement e1=driver.findElement(By.name("identifier"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='shafi.automation';",e1);
		Thread.sleep(5000);
		//Click next button using javascript
		WebElement e2=driver.findElement(By.id("identifierNext"));
		js.executeScript("arguments[0].click();",e2);
		Thread.sleep(5000);
		//Hihglight password element
		WebElement e3=driver.findElement(By.name("password"));
		js.executeScript("arguments[0].style.border='2px dotted red';",e3);
		Thread.sleep(5000);
		

	}

}




