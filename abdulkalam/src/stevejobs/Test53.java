package stevejobs;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Test53
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
		//Check current context as WEBVIEW
		if(driver.isBrowser())
		{
			System.out.println("In WEBVIEW");
			driver.context("NATIVE_APP");
		}
		else
		{
			System.out.println("Not in WEBVIEW");
		}
		//Get contexts in AVD
		Set<String> cl=driver.getContextHandles();
		List<String> acl=new ArrayList(cl);
		for(int i=0;i<acl.size();i++)
		{
			System.out.println(acl.get(i));
		}
		//Get current context name
		String c=driver.getContext();
		System.out.println(c);
		//Close app
		driver.closeApp();
	}
}
