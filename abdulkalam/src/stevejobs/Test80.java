package stevejobs;

import java.io.File;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test80
{
	public static void main(String[] args) throws Exception
	{
		//get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter userid");
		String uid=sc.nextLine();
		System.out.println("Enter criteria");
		String uc=sc.nextLine();
		String p="";
		String pc="";
		if(uc.equalsIgnoreCase("valid"))
		{
			System.out.println("Enter Password");
			p=sc.nextLine();
			System.out.println("Enter criteria");
			pc=sc.nextLine();
		}
		//Create html file for results
		ExtentReports er=
		   new ExtentReports("gmailresults.html",false);        
		ExtentTest et=er.startTest("Gmail login test");
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
		//Userid validations
		try
		{
			if(uid.length()==0 && 
			   driver.findElement(By.xpath(
			   "//*[contains(text(),'Enter an email')]"))
			   .isDisplayed())
			{
				et.log(LogStatus.PASS,
						"Test passed for blank uid");				
			}
			else if(uc.equalsIgnoreCase("invalid") &&
					driver.findElement(By.xpath(
	                "(//*[contains(text(),'find your Google Account')])[2]"))
					.isDisplayed())
			{
				et.log(LogStatus.PASS,
						"Test passed for invalid uid");	
			}
			else if(uc.equalsIgnoreCase("valid") &&
					driver.findElement(By.name("password"))
					.isDisplayed())
			{
				et.log(LogStatus.PASS,
						"Test passed for valid uid");
				//Enter password and click next
				driver.findElement(By.name("password")).sendKeys(p);
				driver.findElement(By.id("passwordNext")).click();
				Thread.sleep(5000);
				//Password validations
				if(p.length()==0 && 
					driver.findElement(By.xpath(
					"//*[text()='Enter a password']"))
					.isDisplayed())
				{
					et.log(LogStatus.PASS,
							"Test passed for blank pwd");
				}
				else if(pc.equalsIgnoreCase("invalid") && 
					driver.findElement(By.xpath(
					"//*[contains(text(),'Wrong password')]"))
					.isDisplayed())
				{
					et.log(LogStatus.PASS,
							"Test passed for invalid pwd");
				}
				else if(pc.equalsIgnoreCase("valid") &&
						driver.findElement(By.xpath(
						"//*[text()='COMPOSE']"))
						.isDisplayed())
				{
					et.log(LogStatus.PASS,
							"Test passed for valid pwd");
				}
				else
				{
					et.log(LogStatus.FAIL,"Test failed for pwd");
					File src=((TakesScreenshot)driver).getScreenshotAs(
							                          OutputType.FILE);
					File dest=new File("pic2.png");
					FileUtils.copyFile(src, dest);
					et.log(LogStatus.FAIL,
							          et.addScreenCapture("pic2.png"));
				}
			}
			else
			{
				et.log(LogStatus.FAIL,"Test failed for userid");
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
			et.log(LogStatus.ERROR,"Test interrupted");
			File src=((TakesScreenshot)driver).getScreenshotAs(
					                          OutputType.FILE);
			File dest=new File("pic3.png");
			FileUtils.copyFile(src, dest);
			et.log(LogStatus.ERROR,
					          et.addScreenCapture("pic3.png"));
		}
		//Close site
		driver.close();
		//save and close results file
		er.endTest(et);
		er.flush();
	}
}
