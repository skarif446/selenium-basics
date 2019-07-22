package stevejobs;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Test54 
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
		//getRemoteAddress()
		URL x=driver.getRemoteAddress();
		System.out.println("Appium server url is "+x.getPath());
		System.out.println("Appium server port is "+
		                                     x.getPort());
		System.out.println("Appium server protocol is "+
		                                     x.getProtocol());
		Thread.sleep(10000);
		//getDeviceTime()
		String y=driver.getDeviceTime();
		System.out.println("Device time is "+y);
		Thread.sleep(10000);
		//getPlatformName()
		String w=driver.getPlatformName();
		System.out.println("Platform name is "+w);
		Thread.sleep(10000);
		//getDisplayDensity()
		long l=driver.getDisplayDensity();
		System.out.println("Display density is "+l);
		Thread.sleep(10000);
		//getSystemBars()
		Map<String,String> hm=new HashMap<String,String>(
						driver.getSystemBars());
		for(Map.Entry m:hm.entrySet())
		{
            System.out.println(m.getKey()+" "+m.getValue());
		} 
		Thread.sleep(10000);
		//isKeyboardShown()
		if(driver.isKeyboardShown())
		{
			driver.hideKeyboard();
		}
		Thread.sleep(10000);
		//close app
		driver.closeApp();
	}
}
