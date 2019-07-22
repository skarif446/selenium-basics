package stevejobs;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
public class Test103 
{
	public static void main(String[] args) throws Exception 
	{
		//Open Excel file for test data reading
		File f=new File("gmailtestdata.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0); //0 indicates Sheet1
		int nour=rsh.getRows();
		int nouc=rsh.getColumns();
		//Open same excel file for results writing
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(0);//0 indicates Sheet1
		//Data driven testing
		//0th row have columns headings
		for(int i=1;i<nour;i++)
		{
			String u=rsh.getCell(0,i).getContents();
			String uc=rsh.getCell(1,i).getContents();
			String p=null;
			String pc=null;
			if(uc.equalsIgnoreCase("valid"))
			{
				p=rsh.getCell(2,i).getContents();
				pc=rsh.getCell(3,i).getContents();
			}
			//Launch site
			System.setProperty("webdriver.chrome.driver",
					     "E:\\batch235\\chromedriver.exe");           
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.gmail.com");
			Thread.sleep(5000);
			//Fill user-id and click next
			driver.findElement(By.name("identifier")).sendKeys(u);
			driver.findElement(By.id("identifierNext")).click();
			Thread.sleep(5000);
			//User-id validations
			try
			{
				if(u.length()==0 && 
				driver.findElement(By.xpath(
	            "//*[contains(text(),'Enter an email')]"))
	            .isDisplayed())
				{
					Label l=new Label(nouc,i,
							     "Test passed for blank uid");
					wsh.addCell(l);
				}
				else if(uc.equalsIgnoreCase("invalid") &&
				driver.findElement(By.xpath(
				"(//*[contains(text(),'find your Google')])[2]"))
				.isDisplayed())
				{
					Label l=new Label(nouc,i,
							   "Test passed for invalid uid");
					wsh.addCell(l);
				}
				else if(uc.equalsIgnoreCase("valid") &&
				driver.findElement(By.name("password"))
				.isDisplayed())
				{
					//Enter password and click next
					driver.findElement(By.name("password")).sendKeys(p);
					driver.findElement(By.id("passwordNext")).click();
					Thread.sleep(10000);
					//Password validations
					if(p.length()==0 && 
					driver.findElement(By.xpath(
					"//*[text()='Enter a password']"))
					.isDisplayed())
					{
						Label l=new Label(nouc,i,
								        "Test passed for blank pwd");
						wsh.addCell(l);
					}
					else if(pc.equalsIgnoreCase("invalid") && 
					driver.findElement(By.xpath(
					"//*[contains(text(),'Wrong password')]"))
					.isDisplayed())
					{
						Label l=new Label(nouc,i,
								        "Test passed for invalid pwd");
						wsh.addCell(l);
					}
					else if(pc.equalsIgnoreCase("valid") &&
					driver.findElement(By.xpath(
					"//*[text()='COMPOSE']"))
					.isDisplayed())
					{
						Label l=new Label(nouc,i,
								          "Test passed for valid pwd");
						wsh.addCell(l);
					}
					else
					{
						Label l=new Label(nouc,i,"Test failed for pwd");
						wsh.addCell(l);
					}
				}
				else
				{
					Label l=new Label(nouc,i,"Test failed for userid");
					wsh.addCell(l);
				}
			}
			catch(Exception ex)
			{
				Label l=new Label(nouc,i,"Test interrupted");
				wsh.addCell(l);
			}
			//Close site
			driver.close();
		}
		//Save and close excel file
		wwb.write(); //save
		wwb.close();
		rwb.close();
	}
}





