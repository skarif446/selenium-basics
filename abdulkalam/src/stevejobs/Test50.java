package stevejobs;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import java.net.URL;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Test50
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
		driver.rotate(ScreenOrientation.LANDSCAPE);
		Thread.sleep(10000);
		driver.rotate(ScreenOrientation.PORTRAIT);
		Thread.sleep(10000);
		driver.pressKeyCode(AndroidKeyCode.HOME);
		Thread.sleep(10000);
		driver.lockDevice();
		Thread.sleep(10000);
		if(driver.isLocked())
		{
			driver.unlockDevice();
		}
		Thread.sleep(10000);
		driver.launchApp();
		Thread.sleep(10000);
		driver.closeApp();
	}
}




