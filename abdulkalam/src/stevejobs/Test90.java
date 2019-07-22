package stevejobs;

import java.io.File;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test90 
{
	public static void main(String[] args) throws Exception
	{
		//get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String x=sc.nextLine();
		//Create html file for results
		ExtentReports er=
		   new ExtentReports("googleresults.html",false);        
		ExtentTest et=er.startTest("Google title test");
		//Launch site
		System.setProperty("webdriver.chrome.driver",
							 "E:\\batch235\\chromedriver.exe");           
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		//Search given word using google
		driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
		Thread.sleep(5000);
		//Validations
		int flag=0;
		int i=1;
		while(2>1)  //infinite loop
		{
			String t=driver.getTitle();
			if(!(t.contains(x)))
			{
				flag=1;
				File src=((TakesScreenshot)driver)
						.getScreenshotAs(OutputType.FILE);
				File dest=new File("pic"+i+".png");
				FileUtils.copyFile(src, dest);
				et.log(LogStatus.FAIL,
						et.addScreenCapture("pic"+i+".png"));
				i=i+1;
			}
			//goto next page if exists
			try
			{
				if(driver.findElement(By.xpath(
				"//*[text()='Next']")).isDisplayed())
				{
					driver.findElement(By.xpath(
					"//*[text()='Next']")).click();
					Thread.sleep(5000);
				}
			}
			catch(Exception ex)
			{
				break; //terminate from loop
			}
		}
		if(flag==0)
		{
			et.log(LogStatus.PASS,"Test passed");
		}
		else
		{
			et.log(LogStatus.FAIL,"Test failed");
		}
		//Close site
		driver.close();
		//Save and close results file
		er.endTest(et);
		er.flush();
		

	}

}
