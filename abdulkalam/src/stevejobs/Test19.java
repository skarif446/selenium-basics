package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test19 
{
	public static void main(String[] args) throws Exception
	{
		//Run browser driver to open browser                    
		System.setProperty("webdriver.chrome.driver",
				"E:\\batch235\\chromedriver.exe");
		//Create object to access opened browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);
		//Click register link
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(5000);
		//Fill fields
		driver.findElement(By.name("firstName")).sendKeys("Abdul");
		driver.findElement(By.name("lastName")).sendKeys("kalam");
		driver.findElement(By.name("phone")).sendKeys("9000624955");
		driver.findElement(By.name("userName")).sendKeys("apj@abdulkalam.com");
		driver.findElement(By.name("address1")).sendKeys("Mosque street");
		driver.findElement(By.name("address2")).sendKeys("Dhanushkoti road");
		driver.findElement(By.name("city")).sendKeys("Rameshwaram");
		driver.findElement(By.name("state")).sendKeys("Tamilnadu");
		driver.findElement(By.name("postalCode")).sendKeys("600072");
		//Automate a drop-down
		WebElement e=driver.findElement(By.name("country"));
		Select s=new Select(e);
		System.out.println(s.getOptions().size());
	}
}











