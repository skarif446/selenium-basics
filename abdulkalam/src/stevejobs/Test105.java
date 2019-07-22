package stevejobs;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test105
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\batch235\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Method m[]=driver.getClass().getMethods();              
		System.out.println(m.length);
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i].getName());
		}
		m[9].invoke(driver,"http://www.google.co.in");
		Thread.sleep(5000);
		m[11].invoke(driver);

	}

}
