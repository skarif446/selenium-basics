package stevejobs;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Test27 
{
	public static void main(String[] args) throws InterruptedException
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
		driver.findElement(By.xpath("//*[text()='More options']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Create account']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("FirstName")).sendKeys("Abdul");
		driver.findElement(By.name("LastName")).sendKeys("kalam");
		driver.findElement(By.name("GmailAddress")).sendKeys("apjkalam340");
		driver.findElement(By.name("Passwd")).sendKeys("batch235.sleep");
		driver.findElement(By.name("PasswdAgain")).sendKeys("batch235.sleep");
		Thread.sleep(5000);
		//Automate <div> tag drop down
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(By.xpath("//*[@title='Birthday']"));
		a.click(e1).build().perform();
		Thread.sleep(2000);
		a.sendKeys("o").build().perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.name("BirthDay")).sendKeys("15");
		driver.findElement(By.name("BirthYear")).sendKeys("1931");
		WebElement e2=driver.findElement(By.xpath("//*[@id='Gender']/child::*[1]"));
		a.click(e2).build().perform();
		Thread.sleep(2000);
		a.sendKeys("m").build().perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.name("RecoveryPhoneNumber")).sendKeys("9000624911");
		driver.findElement(By.name("RecoveryEmailAddress")).sendKeys("apj@abdulkalam.com");
		driver.findElement(By.name("submitbutton")).click();
		Thread.sleep(5000);
		//Automate scrolling on banner(element)
		for(int i=1;i<=20;i++)
		{
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(1000);
		}
		driver.findElement(By.name("iagreebutton")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
