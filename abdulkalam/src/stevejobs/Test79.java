package stevejobs;
import java.io.File;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class Test79
{
	public static void main(String[] args) throws Exception
	{
		//get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mobile number");
		String m=sc.nextLine();
		System.out.println("Enter criteria");
		String mc=sc.nextLine();
		System.out.println("Enter Password");
		String p=sc.nextLine();
		System.out.println("Enter criteria");
		String pc=sc.nextLine();
		//Create html file for results
		ExtentReports er=
		   new ExtentReports("w2smsresults.html",false);        
		ExtentTest et=er.startTest("Way2sms login test");
		//Launch site
		System.setProperty("webdriver.chrome.driver",
							 "E:\\batch235\\chromedriver.exe");           
		WebDriver driver=new ChromeDriver();
		driver.get(
			"http://site24.way2sms.com/content/index.html");
		Thread.sleep(5000);
		//Do login
		driver.findElement(By.name("username")).sendKeys(m);
		driver.findElement(By.name("password")).sendKeys(p);
		driver.findElement(By.id("loginBTN")).click();
		Thread.sleep(5000);
		//Validations
		try
		{
			if(m.equals("") && 
				ExpectedConditions.alertIsPresent()!=null)
			{
				et.log(LogStatus.PASS,
					"Test passed for blank mobile number");     
			}
			else if(p.equals("") && 
				ExpectedConditions.alertIsPresent()!=null)
			{
				et.log(LogStatus.PASS,
					"Test passed for blank password");     
			}
			else if(m.length()<10 &&
				ExpectedConditions.alertIsPresent()!=null)
			{
				et.log(LogStatus.PASS,
				   "Test passed for wrong size of mobile no:");
			}
			else if(mc.equalsIgnoreCase("invalid") &&
				ExpectedConditions.alertIsPresent()!=null)
			{
				et.log(LogStatus.PASS,
				   "Test passed for wrong mobile no:");
			}
			else if(mc.equalsIgnoreCase("valid") && 
					pc.equalsIgnoreCase("invalid") &&
					driver.findElement(By.xpath(
					"//*[contains(text(),'Forgot Password')]"))
					.isDisplayed())
			{
				et.log(LogStatus.PASS,
					"Test passed for wrong password");
			}
			else if(mc.equalsIgnoreCase("valid") && 
					pc.equalsIgnoreCase("valid") &&
					driver.findElement(By.xpath(
					"//*[text()='Send SMS')]"))
					.isDisplayed())
			{
				et.log(LogStatus.PASS,
					"Test passed for valid data");
			}
			else
			{
				et.log(LogStatus.FAIL,"Test failed");
				File src=((TakesScreenshot)driver).getScreenshotAs(
						                          OutputType.FILE);
				File dest=new File("pic1.png");
				FileUtils.copyFile(src, dest);
				et.log(LogStatus.FAIL,
						          et.addScreenCapture("pic1.png"));
			}
		}
		catch(Exception ex)
		{
			et.log(LogStatus.ERROR,"Test was interrupted");
			File src=((TakesScreenshot)driver).getScreenshotAs(
					                          OutputType.FILE);
			File dest=new File("pic2.png");
			FileUtils.copyFile(src, dest);
			et.log(LogStatus.ERROR,
					        et.addScreenCapture("pic2.png"));
		}
		//Close site
		driver.close();
		//Save and close results file
		er.endTest(et);
		er.flush();	
	}
}




