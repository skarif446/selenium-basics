package stevejobs;
import java.io.File;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class Test83
{
	public static void main(String[] args) throws Exception
	{
		//get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter userid");
		String uid=sc.nextLine();
		System.out.println("Enter Password");
		String p=sc.nextLine();
		//Create html file for results
		ExtentReports er=
			new ExtentReports("gmailresults.html",false);        
		ExtentTest et=er.startTest("Mail deletion test");
		//Launch site
		System.setProperty("webdriver.chrome.driver",
						"E:\\batch235\\chromedriver.exe");           
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//Fill userid and click next
		driver.findElement(By.name("identifier")).sendKeys(uid);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(5000);
		//Fill password and click next
		driver.findElement(By.name("password")).sendKeys(p);
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(5000);
		//Get mails count before deletion
		String x=driver.findElement(By.xpath(
			  "(//*[contains(text(),'Inbox')])[3]")).getText();
		String y=x.substring(7,x.length()-1);
		int nombd=Integer.parseInt(y);
		System.out.println(nombd);
		//Delete a mail
		driver.findElement(By.xpath(
				        "(//*[@role='checkbox'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				   "(//*[@class='asa'])[3]/child::*")).click();
		Thread.sleep(5000);
		//Get mails count
		x=driver.findElement(By.xpath(
			 "(//*[contains(text(),'Inbox')])[3]")).getText();
		y=x.substring(7,x.length()-1);
		int nomad=Integer.parseInt(y);
		System.out.println(nomad);
		//Validation
		if(nombd==nomad+1)
		{
		 et.log(LogStatus.PASS,"Mail delete test was passed");
		}
		else
		{
		  et.log(LogStatus.FAIL,"Mail delete test was failed");   
			File src=((TakesScreenshot)driver).getScreenshotAs(
                                              OutputType.FILE);
			File dest=new File("pic.png");
			FileUtils.copyFile(src, dest);
			et.log(LogStatus.FAIL,
					et.addScreenCapture("pic.png"));
		}
		//Do logout
		driver.findElement(By.xpath(
			"//*[contains(@title,'Google Account')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);
		//Close site 
		driver.close();
		//Save and close results file
		er.endTest(et);
		er.flush();
	}
}