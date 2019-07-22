package stevejobs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;
public class Test44 
{
	public static void main(String[] args) throws Exception
	{
		//Launch site(SWD)
		System.setProperty("webdriver.chrome.driver",
		        	"E:\\batch235\\chromedriver.exe");         
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.youtube.com");
		Thread.sleep(5000);
		//Search for video(SWD)
		driver.findElement(By.name("search_query"))
		                   .sendKeys("kalam sir speech");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText(
				"Dr. A P J Abdul Kalam in European")).click();
		Thread.sleep(5000);
		//Click on Skip add if exists(Sikuli)
		Screen s=new Screen();
		if(s.exists("skipadd.png")!=null)
		{
			s.click("skipadd.png");
		}
		Thread.sleep(5000);
		//Move mouse pointer to video body
		Location l=new Location(300,300);
		s.wheel(l, Button.LEFT,0);
		//Click pause
		s.click("pause.png");
		Thread.sleep(5000);
		//Move mouse pointer to video body
		s.wheel(l,Button.LEFT,0);
		//Click play
		s.click("play.png");
		Thread.sleep(10000);
		//Move mouse pointer to video body
		s.wheel(l,Button.LEFT,0);
		//Move mouse pointer to volume
		s.mouseMove("volume.png");
		//Get coordinates of volume bubble
		Match e=s.find("bubble.png");
		int x=e.getX();
		int y=e.getY();
		Location sl1=new Location(x-30,y);
		s.dragDrop(e,sl1); //to left
		Thread.sleep(5000);
		Location sl2=new Location(x+30,y);                      
		s.dragDrop(e,sl2); //to right
		//Close site(SWD)
		driver.close();
	}
}





