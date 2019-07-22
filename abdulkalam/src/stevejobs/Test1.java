package stevejobs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Activate chrome browser driver for chrome browser
		System.setProperty("webdriver.chrome.driver",
				       "E:\\batch235\\chromedriver.exe");
		//To connect to chrome browser, create object 
		//to WebDriver or ChromeDriver
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		//call methods to operate pages in browser
		driver.get("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("kalam");
		Thread.sleep(5000);
	}
}





