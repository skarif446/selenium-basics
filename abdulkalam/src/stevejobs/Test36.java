package stevejobs;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
public class Test36 
{
	public static void main(String[] args) throws Exception
	{
		//Give browser name
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a browser name");
		String b=sc.nextLine();
		WebDriver driver = null;
		if(b.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"E:\\batch235\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(b.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
					"E:\\batch235\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(b.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",
					"E:\\batch235\\iedriverserver.exe");
			driver=new InternetExplorerDriver();
		}
		else if(b.equals("opera"))
		{
			System.setProperty("webdriver.opera.driver",
					"E:\\batch235\\operadriver.exe");
			driver=new OperaDriver();
		}
		else
		{
			System.out.println("Unknown browser");
			System.exit(0); //Stop execution without error
		}
		Thread.sleep(5000);
		driver.close();
	}
}
