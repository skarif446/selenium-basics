package stevejobs;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test97 
{
	public static void main(String[] args) throws InterruptedException 
	{
		HashMap<String,String> hm=
				            new HashMap<String,String>();  
		hm.put("ayushbadsar","valid");  
		hm.put("","invalid");  
		hm.put("ayushbad","invalid");
		//for each loop starting
		for(Map.Entry m:hm.entrySet()) 
		{  
			//Run browser driver to open browser                    
			System.setProperty("webdriver.chrome.driver",
						"E:\\batch235\\chromedriver.exe");
			//Create object to access opened browser
			WebDriver driver=new ChromeDriver();
			//Launch site
			driver.get("http://www.gmail.com");
			Thread.sleep(5000);
			//Enter userid
			driver.findElement(By.name("identifier"))
			        .sendKeys((String)m.getKey(),Keys.ENTER);
			Thread.sleep(5000);
			//Validations
			try
			{
				if(m.getValue().equals("valid") && 
				driver.findElement(By.name("password"))
				.isDisplayed())
				{
					System.out.println("Test passed");
				}
				else if(m.getValue().equals("invalid") &&
				driver.findElement(By.xpath("(//*[contains(text(),'Enter an email')])|(//*[contains(text(),'find your Google')])[2]"))
				.isDisplayed())
				{
					System.out.println("Test passed");
				}
				else
				{
					System.out.println("Test failed");
				}
			}
			catch(Exception ex)
			{
				System.out.println("Test interrupted");
			}
			finally
			{
				//Close site
				driver.close();
			}
		}  //for each loop ending
	}
}
