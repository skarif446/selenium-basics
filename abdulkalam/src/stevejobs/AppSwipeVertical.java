package stevejobs;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class AppSwipeVertical 
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
		dc.setCapability("appPackage","com.android.deskclock");
		dc.setCapability("appActivity",
				            "com.android.deskclock.DeskClock");
		//Create driver object
		AndroidDriver driver=new AndroidDriver(u,dc);
		Thread.sleep(10000);
		driver.findElement(By.xpath(
			"//*[@content-desc='Cities'][@index='1']")).click();
		Thread.sleep(10000);
		driver.context("NATIVE_APP");
		int w=driver.manage().window().getSize().getWidth();
		int h=driver.manage().window().getSize().getHeight();
		TouchAction ta=new TouchAction(driver);
		//swipe from bottom to top
		int x=(int)(w/2);
		int y=(int)(h*0.9); //bottom
		int temp=(int)(h*0.7); //top
		ta.press(x,y).moveTo(0,temp-y).release().perform();
		Thread.sleep(10000);
		//swipe from top to bottom
		x=(int)(w/2);
		y=(int)(h*0.7); //top
		temp=(int)(h*0.9); //bottom
		ta.press(x,y).moveTo(0,temp-y).release().perform();
		Thread.sleep(5000);
		//Close app
		driver.closeApp();
	}
}








