package stevejobs;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test62 
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
		dc.setCapability("appActivity",
				      "com.android.calculator2.Calculator");
		//Create driver object
		AndroidDriver driver=new AndroidDriver(u,dc);
		Thread.sleep(10000);
		driver.context("NATIVE_APP");
		int w=driver.manage().window().getSize().getWidth();
		int h=driver.manage().window().getSize().getHeight();
		//Get X Y Coordinates for touch action 1(Top left side)
		int x1 = (int)(w*0.20);
		int y1 = (int)(h*0.20);
		//Get X Y Coordinates for touch action 2(Top right side)
		int x2 = (int)(w*0.80);
		int y2 = (int)(h*0.20);
		TouchAction ta1=new TouchAction(driver)
		                .longPress(x1,y1)
		                .waitAction(Duration.ofSeconds(10));
		TouchAction ta2=new TouchAction(driver)
		                .longPress(x2,y2)
		                .waitAction(Duration.ofSeconds(10));
		//Create object of MultiTouchAction class.
		MultiTouchAction ma=new MultiTouchAction(driver);
		ma.add(ta1).add(ta2).perform();


	}

}
