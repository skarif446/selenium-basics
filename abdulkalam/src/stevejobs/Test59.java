package stevejobs;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Test59
{
	public static void main(String[] args) throws Exception
	{
		//Launch app in AVD
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","4200e6519aac84b9");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","6.0.1");
		dc.setCapability("appPackage","com.whatsapp");
		dc.setCapability("appActivity","com.whatsapp.Main");
		//Create driver object
		AndroidDriver driver=new AndroidDriver(u,dc);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@text='Agree and continue']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@text='CONTINUE']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@text='Allow'][@index='2']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@text='Allow'][@index='2']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@text='phone number'][@index='1']")).sendKeys("8074614704");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='Next'][@index='3']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='OK'][@index='1']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='CONTINUE']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@text='Allow'][@index='1']")).click();
		Thread.sleep(10000);
	}
}
