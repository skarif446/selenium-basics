package stevejobs;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Test51
{
	public static void main(String[] args) throws Exception
	{
		//Launch app in AVD
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","emulator-5554");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","4.2.2");
		dc.setCapability("appPackage","com.android.calculator2");
		dc.setCapability("appActivity","com.android.calculator2.Calculator");
		//Create driver object
		AndroidDriver driver=new AndroidDriver(u,dc);
		Thread.sleep(10000);
		//Operate elements in app screen
				driver.findElement(By.xpath(
						       "//*[@text='8'][@index='1']")).click();
				driver.findElement(By.xpath(
						       "//*[@text='6'][@index='2']")).click();
				driver.findElement(By.xpath(
					 "//*[@content-desc='plus'][@index='3']")).click();
				driver.findElement(By.xpath(
						"//*[@text='4'][@index='0']")).click();
				driver.findElement(By.xpath(
						"//*[@text='0'][@index='1']")).click();
				driver.findElement(By.xpath(
					"//*[@content-desc='equals'][@index='2']")).click();
				Thread.sleep(10000);
				String x=driver.currentActivity();
				String y=driver.getCurrentPackage();
				System.out.println(x+" "+y);
				//close app
				driver.closeApp();
	}
}
