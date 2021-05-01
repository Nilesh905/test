package WebDriver;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example8setsize
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\client5\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	
	Dimension d = new Dimension(500, 600);
 //   driver.manage().window().setSize(d);
	
	
	
	
//Dimension d = new Dimension(500,500);
	
	// driver.manage().window().setSize(d);
	
	
	
	
	
	
	
}
}
