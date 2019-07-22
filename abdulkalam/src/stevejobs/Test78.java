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
public class Test78
{
	public static void main(String[] args) throws Exception
	{
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter userid");
		String uid=sc.nextLine();
		System.out.println("Enter criteria");
		String c=sc.nextLine();
		//Create html file for results
		ExtentReports er=
				new ExtentReports("gmailresults.html",false);
		ExtentTest et=er.startTest("Gmail userid testing");
		//Launch site
		System.setProperty("webdriver.chrome.driver",
					         "E:\\batch235\\chromedriver.exe");           
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//Enter user-id and click next
		driver.findElement(By.name("identifier")).sendKeys(uid);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(5000);
		//Validations
		try
		{
			if(c.equalsIgnoreCase("valid") && 
					driver.findElement(By.name("password"))
					.isDisplayed())
			{
				et.log(LogStatus.PASS,"Test passed");
				WebElement e=driver.findElement(By.name("password"));
				js.executeScript("arguments[0].style.border='2px dotted blue';",e);
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest=new File("pic1.png");
				FileUtils.copyFile(src, dest);
				et.log(LogStatus.PASS,et.addScreenCapture("pic1.png"));
			}
			else if(c.equalsIgnoreCase("invalid") && 
				driver.findElement(By.xpath("//*[contains(text(),'Enter an email')] | (//*[contains(text(),'find your Google Account')])[2]"))
				.isDisplayed())
			{
				et.log(LogStatus.PASS,"Test passed");
				WebElement e=driver.findElement(By.xpath("//*[contains(text(),'Enter an email')] | (//*[contains(text(),'find your Google Account')])[2]"));
				js.executeScript("arguments[0].style.border='2px dotted blue';",e);
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest=new File("pic2.png");
				FileUtils.copyFile(src, dest);
				et.log(LogStatus.PASS,et.addScreenCapture("pic2.png"));
			}
			else
			{
				et.log(LogStatus.FAIL,"Test failed");
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest=new File("pic3.png");
				FileUtils.copyFile(src, dest);
				et.log(LogStatus.FAIL,et.addScreenCapture("pic3.png"));
			}
		}
		catch(Exception ex)
		{
			et.log(LogStatus.ERROR,"Test interrupted");
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("pic4.png");
			FileUtils.copyFile(src, dest);
		    et.log(LogStatus.ERROR,et.addScreenCapture("pic4.png"));
		}
		//Close site
		driver.close();
		//save and close results file
		er.endTest(et);
		er.flush();
		Thread.sleep(5000);
		//Open results file
		WebDriver obj=new ChromeDriver();
		obj.get("file:///E:/batch235/abdulkalam/gmailresults.html");
	}
}