package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test81
{
	public static void main(String[] args) throws Exception
	{
		//Launch site
		System.setProperty("webdriver.chrome.driver",
				 		"E:\\batch235\\chromedriver.exe");           
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com");
		Thread.sleep(5000);
		//Collect all input tag elements
		List<WebElement> l=driver.findElements(
				                 By.tagName("input"));
		int ne=l.size();
		int ntb=0;
		int nrb=0;
		int ncb=0;
		int nsb=0;
		int nseb=0;
		int npb=0;
		int nd=0;
		int others=0;
		for(int i=0;i<ne;i++)
		{
			String x=l.get(i).getAttribute("type");
			switch(x)
			{
				case "radio":
					nrb=nrb+1;
					break;
				case "text":
					ntb=ntb+1;
					break;
				case "checkbox":
					ncb=ncb+1;
					break;
				case "date":
					nd=nd+1;
					break;
				case "password":
					npb=npb+1;
					break;
				case "submit":
					nsb=nsb+1;
					break;
				case "search":
					nseb=nseb+1;
					break;
				default:
					others=others+1;
					break;
			}
		}
		System.out.println("NO: of elements:"+ne);
		System.out.println("NO: of text boxes:"+ntb);
		System.out.println("NO: of radio buttons:"+nrb);
		System.out.println("NO: of checkboxes:"+ncb);
		System.out.println("NO: of search boxes:"+nseb);
		System.out.println("NO: of date objects:"+nd);
		System.out.println("NO: of submit buttons:"+nsb);
		System.out.println("NO: of password boxes:"+npb);
		System.out.println("NO: of other elements:"+others);
		//Close site
		driver.close();
		

	}

}
