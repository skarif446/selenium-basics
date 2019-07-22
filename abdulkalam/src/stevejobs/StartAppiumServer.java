package stevejobs;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;
public class StartAppiumServer 
{
	public static void main(String[] args) throws Exception
	{
		//Need to install node.js
		//Start Appium Server
	    AppiumDriverLocalService as=
	    		   AppiumDriverLocalService.buildDefaultService();
		as.start();
		//Get URL of appium server and create URL object
	    String asurl=as.getUrl().toString();
	    URL u=new URL(asurl);
	    System.out.println("Appium Service Address : - "+asurl);
	    //Provide device and app details
	    DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName","emulator-5554");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion","4.2.2");
		dc.setCapability("appPackage","com.android.calculator2");
		dc.setCapability("appActivity","com.android.calculator2.Calculator");
		//Create driver object
		AndroidDriver driver=new AndroidDriver(u,dc);
		Thread.sleep(10000);
		driver.closeApp();
		//Stop appium server
		as.stop();
	}
}
