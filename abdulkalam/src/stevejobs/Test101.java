package stevejobs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.LogStatus;

public class Test101
{
	public static void main(String[] args) 
			              throws Exception
	{
		//Open existing file for test data reading
		File f1=new File("gmailtestdata.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		//Open new File for results writing
		File f2=new File("gmailtestresults.txt");
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		//Data driven testing
		String l;
		while((l=br.readLine())!=null)
		{
			//split line of text into pieces
			String p[]=l.split(",");
			//Launch site
			System.setProperty("webdriver.chrome.driver",
					 "E:\\batch235\\chromedriver.exe");           
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.gmail.com");
			Thread.sleep(5000);
			//Fill user-id and click next
			driver.findElement(By.name("identifier")).sendKeys(p[0]);
			driver.findElement(By.id("identifierNext")).click();
			Thread.sleep(5000);
			//User-id validations
			try
			{
				if(p[0].length()==0 && 
				driver.findElement(By.xpath(
	            "//*[contains(text(),'Enter an email')]"))
	            .isDisplayed())
				{
					bw.write("Test passed for blank uid");
					bw.newLine();
				}
				else if(p[1].equalsIgnoreCase("invalid") &&
				driver.findElement(By.xpath(
				"(//*[contains(text(),'find your Google')])[2]"))
				.isDisplayed())
				{
					bw.write("Test passed for invalid uid");
					bw.newLine();
				}
				else if(p[1].equalsIgnoreCase("valid") &&
				driver.findElement(By.name("password"))
				.isDisplayed())
				{
					bw.write("Test passed for valid uid");
					bw.newLine();
					//Enter password and click next
					driver.findElement(By.name("password")).sendKeys(p[2]);
					driver.findElement(By.id("passwordNext")).click();
					Thread.sleep(5000);
					//Password validations
					if(p[2].length()==0 && 
					driver.findElement(By.xpath(
					"//*[text()='Enter a password']"))
					.isDisplayed())
					{
						bw.write("Test passed for blank pwd");
						bw.newLine();
					}
					else if(p[3].equalsIgnoreCase("invalid") && 
					driver.findElement(By.xpath(
					"//*[contains(text(),'Wrong password')]"))
					.isDisplayed())
					{
						bw.write("Test passed for invalid pwd");
						bw.newLine();
					}
					else if(p[3].equalsIgnoreCase("valid") &&
					driver.findElement(By.xpath(
					"//*[text()='COMPOSE']"))
					.isDisplayed())
					{
						bw.write("Test passed for valid pwd");
						bw.newLine();
					}
					else
					{
						bw.write("Test failed for pwd");
						bw.newLine();
					}
				}
				else
				{
					bw.write("Test failed for userid");
					bw.newLine();
				}
			}
			catch(Exception ex)
			{
				bw.write("Test interrupted");
				bw.newLine();
			}
			//Close site
			driver.close();
		}
		//Close files
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}
}