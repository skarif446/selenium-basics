package stevejobs;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test14 
{
	public static void main(String[] args) throws Exception
	{
		//Run browser driver to open browser                    
		System.setProperty("webdriver.chrome.driver",
					"E:\\batch235\\chromedriver.exe");
		//Create object to access opened browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		int nove=0;
		int nohe=0;
		List<WebElement> l=driver.findElements(By.xpath("//a"));
		System.out.println(l.size());
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).isDisplayed())
			{
				nove=nove+1;
			}
			else
			{
				nohe=nohe+1;
			}
		}
		System.out.println(nove);
		System.out.println(nohe);
		//Close site
		driver.close();
	}
}






