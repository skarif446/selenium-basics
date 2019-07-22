package stevejobs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test76
{
	public static void main(String[] args) throws Exception
	{
		//Launch site
		System.setProperty("webdriver.chrome.driver",
		           "E:\\batch235\\chromedriver.exe");           
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		//Get title
		String t=driver.getTitle();
		if(t.equals("Google"))
		{
			System.out.println("Title test was passed");
		}
		else
		{
			System.out.println("Title test was failed");
		}
		//Close site
		driver.close();
		

	}

}





