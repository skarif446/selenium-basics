package stevejobs;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Test60
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		String x=sc.nextLine();
		//Launch app in AVD
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","4200e6519aac84b9");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","6.0.1");
		dc.setCapability("appPackage","com.android.contacts");
		dc.setCapability("appActivity","com.android.dialer.DialtactsActivity");
		//Create driver object
		AndroidDriver driver=new AndroidDriver(u,dc);
		Thread.sleep(10000);
		for(int i=0;i<x.length();i++)
		{
			char d=x.charAt(i);
			driver.findElement(By.xpath("//*[@text='"+d+"'][@index='0']")).click();
			Thread.sleep(5000);
		}
		driver.findElement(By.xpath("//*[@content-desc='Call'][@index='1']")).click();
		Thread.sleep(10000);				
	}
}






