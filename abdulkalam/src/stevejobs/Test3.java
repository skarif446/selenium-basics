package stevejobs;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test3
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Open browser using chromedriver.exe
		System.setProperty("webdriver.chrome.driver",
				"E:\\batch235\\chromedriver.exe");
		//Create object to connect to browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(5000);
		//Fill fields
		driver.findElement(By.name("email")).sendKeys("viratkohli@india.com");
		driver.findElement(By.name("pass")).sendKeys("anushkakohli");
		driver.findElement(By.id("u_0_2")).click();
	}
}



