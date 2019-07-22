package stevejobs;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class AppSwipeHorizantal
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
		dc.setCapability("appPackage","com.android.calendar");
		dc.setCapability("appActivity",
				      "com.android.calendar.AllInOneActivity");
		//Create driver object
		AndroidDriver driver=new AndroidDriver(u,dc);
		Thread.sleep(10000);
		driver.context("NATIVE_APP");
		int w=driver.manage().window().getSize().getWidth();
		int h=driver.manage().window().getSize().getHeight();
		TouchAction ta=new TouchAction(driver);
		//swipe from right to left
		int x=(int)(w*0.9);//right
		int y=(int)(h/2);
		int temp=(int)(w*0.7); //left
		ta.press(x,y).moveTo(temp-x,0).release().perform();
		Thread.sleep(10000);
		//swipe from left to right
		x=(int)(w*0.7);//left
		y=(int)(h/2);
		temp=(int)(w*0.9); //right
		ta.press(x,y).moveTo(temp-x,0).release().perform();
		Thread.sleep(5000);
		//Close app
		driver.closeApp();
	}
}
