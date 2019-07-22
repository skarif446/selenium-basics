package stevejobs;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Key;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class Test45 
{
	public static void main(String[] args) throws Exception 
	{
		//Launch site(SWD)
		System.setProperty("webdriver.chrome.driver",
				      "E:\\batch235\\chromedriver.exe");         
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//Capture full screen(Sikuli)
		Screen s=new Screen();
		ScreenImage si=s.capture();
		BufferedImage bi=si.getImage();
		File f1=new File("E:\\batch235\\fullscreen.png");
		ImageIO.write(bi,"png",f1);
		//Capture region of screen(Sikuli)
		Region r=new Region(200,300,200,100); //x,y,width,height
		ScreenImage sr=s.capture(r);
		BufferedImage br=sr.getImage();
		File f2=new File("E:\\batch235\\region.png");
		ImageIO.write(br,"png",f2);
		//Close site(Sikuli)
		s.keyDown(Key.ALT);
		s.keyDown(Key.F4);
		s.keyUp(Key.F4);
		s.keyUp(Key.ALT);
		
		
		
		
		

	}

}
