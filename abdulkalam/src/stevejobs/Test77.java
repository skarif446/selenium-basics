package stevejobs;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test77
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Get a word from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String x=sc.nextLine();
		//Launch site
		System.setProperty("webdriver.chrome.driver",
				          "E:\\batch235\\chromedriver.exe");           
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		//Enter word in google to search
		driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
		Thread.sleep(5000);
		//Get title of next page
		String y=driver.getTitle();
		if(y.contains(x))
		{
			System.out.println("Title test was passed");
		}
		else
		{
			System.out.println("Title test was failed");
		}
		//Close site
		driver.close();
	}
}
