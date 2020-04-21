package FirstMaven.FirstMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTubeVideoTest {

	public static void main(String[] args) throws FindFailed
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramakrishna\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=qvE2miLMbNk");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		Screen s=new Screen();
		Pattern pauseimg=new Pattern("pause.PNG");
		s.wait(pauseimg, 2000);
		s.click();
		s.click();
		Pattern run=new Pattern("run.PNG");
		s.wait(run, 5000);
		s.click();
		Pattern setting=new Pattern("setting1.PNG");
		s.wait(setting, 2000);
		s.click();
		s.click();
		Pattern pixels720=new Pattern("pixels720.PNG");
		s.wait(pixels720, 2000);
		s.click();
		s.click();
		
		Pattern pixels144=new Pattern("pixels144.PNG");
		s.wait(pixels144, 2000);
		s.click();
		s.click();
		
		
	}

}
