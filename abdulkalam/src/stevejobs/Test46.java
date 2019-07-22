package stevejobs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
public class Test46 
{
	public static void main(String[] args) throws Exception
	{
		//Launch site(SWD)
		System.setProperty("webdriver.chrome.driver",
			      "E:\\batch235\\chromedriver.exe");         
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		Screen s=new Screen();
		s.type("sample4.png","mindq123");
	}
}






