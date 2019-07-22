package stevejobs;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Test49 
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
		//Goto People app from apps list
		driver.pressKeyCode(AndroidKeyCode.HOME);
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				       "//*[@content-desc='Apps'][@index='2']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"//*[@text='People'][@index='16']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(
			"//*[@content-desc='Add Contact'][@index='1']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"//*[@text='Name'][@class='android.widget.EditText']")).sendKeys("Kalam");
		driver.findElement(By.xpath(
				"//*[@text='Phone'][@class='android.widget.EditText']")).sendKeys("9000909090");
		driver.findElement(By.xpath(
				"//*[@text='Email'][@class='android.widget.EditText']")).sendKeys("Kalam@kalam.com");
		driver.findElement(By.xpath(
				"//*[@text='Address'][@class='android.widget.EditText']")).sendKeys("Rameshwaram");
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"//*[@text='Done'][@index='1']")).click();
		Thread.sleep(10000);
		driver.pressKeyCode(AndroidKeyCode.HOME);
		Thread.sleep(10000);		
		driver.findElement(By.xpath(
			       "//*[@content-desc='Apps'][@index='2']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@text='Messaging'][@index='14']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@content-desc='New message'][@index='0']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@text='To'][@index='0']")).sendKeys("Kalam");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@text='Type message'][@index='0']")).sendKeys("Hi sir");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@content-desc='Send'][@index='0']")).click();
		Thread.sleep(10000);
		driver.pressKeyCode(AndroidKeyCode.HOME);
		Thread.sleep(10000);	
		driver.launchApp();
		driver.closeApp();
	}
}




