package stevejobs;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Test55 
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
		//getSupportedPerformanceDataTypes()
		List<String> pl=driver.getSupportedPerformanceDataTypes();
		for(int i=0;i<pl.size();i++)
		{
			System.out.println(pl.get(i));
		}
		//getPerformanceData()
		System.out.println("cpu information:");
		List<List<Object>> ci=driver.getPerformanceData(
				"com.android.calculator2","cpuinfo",1000);
		for(int i=0;i<ci.size();i++)
		{
			for(int j=0;j<ci.get(i).size();j++)
			{
				System.out.println(ci.get(i).get(j).toString());
			}
		}
		Thread.sleep(10000);
		System.out.println("memory information:");
		List<List<Object>> mi=driver.getPerformanceData("com.android.calculator2","memoryinfo",1000);
		for(int i=0;i<mi.size();i++)
		{
			for(int j=0;j<mi.get(i).size();j++)
			{
				System.out.println(mi.get(i).get(j).toString());
			}
		}
		Thread.sleep(10000);
		System.out.println("battery information:");
		List<List<Object>> bi=driver.getPerformanceData(
				"com.android.calculator2","batteryinfo",1000);
		for(int i=0;i<bi.size();i++)
		{
			for(int j=0;j<bi.get(i).size();j++)
			{
				System.out.println(bi.get(i).get(j).toString());
			}
		}
		Thread.sleep(10000);
		System.out.println("network information:");
		List<List<Object>> ni=driver.getPerformanceData(
				"com.android.calculator2","networkinfo",1000);
		for(int i=0;i<ni.size();i++)
		{
			for(int j=0;j<ni.get(i).size();j++)
			{
				System.out.println(ni.get(i).get(j).toString());
			}
		}
		Thread.sleep(10000);
		//close app
		driver.closeApp();
	}
}
