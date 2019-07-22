package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Run browser driver to open browser                    
		System.setProperty("webdriver.chrome.driver",
					"E:\\batch235\\chromedriver.exe");
		//Create object to access opened browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		String x=driver.findElement(By.name("identifier")).getAttribute("aria-label");
		System.out.println(x);
		String y=driver.findElement(By.name("identifier")).getCssValue("text-align");
		System.out.println(y);
		String z=driver.findElement(By.name("identifier")).getText();
		System.out.println(z);
		String w=driver.findElement(By.name("identifier")).getTagName();
		System.out.println(w);
		//close site
		driver.close();
		

	}

}





