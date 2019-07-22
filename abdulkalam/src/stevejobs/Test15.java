package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Run browser driver to open browser                    
		System.setProperty("webdriver.chrome.driver",
					"E:\\batch235\\chromedriver.exe");
		//Create object to access opened browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.mercurytravels.co.in");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		int novi=0;
		int nohi=0;
		List<WebElement> l=driver.findElements(
				By.xpath("//img|//input[@type='image']"));
		System.out.println(l.size());
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).isDisplayed())
			{
				novi=novi+1;
			}
			else
			{
				nohi=nohi+1;
			}
		}
		System.out.println(novi);
		System.out.println(nohi);
		//Close site
		driver.close();

	}

}
