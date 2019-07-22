package stevejobs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Activate browser driver for browser
		System.setProperty("webdriver.chrome.driver",
				"E:\\batch235\\chromedriver.exe");
		//Create object to connect to browser
		WebDriver driver=new ChromeDriver();
		//get site
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);
		//Fill fields
		driver.findElement(By.name("userName")).sendKeys("admin");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("katrinakaif");
		Thread.sleep(5000);
		//Click button
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		//Close site
		driver.close();
	}
}



