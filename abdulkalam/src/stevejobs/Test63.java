package stevejobs;

import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test63
{
	public static void main(String[] args) throws Exception
	{
		//Get name of environment
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter computer or mobile");
		String env=sc.nextLine();
		//Create driver object
		WebDriver driver;
		if(env.equals("computer"))
		{
			System.setProperty("webdriver.chrome.driver",
			           "E:\\batch235\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
		{
			URL u=new URL("http://0.0.0.0:4723/wd/hub");
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability(CapabilityType.BROWSER_NAME,"Browser");
			dc.setCapability("deviceName","emulator-5554");
			dc.setCapability("platformName","android");
			dc.setCapability("platformVersion","4.2.2");
			driver=new AndroidDriver(u,dc);
		}
		driver.get("http://www.google.co.in");
		

	}

}





