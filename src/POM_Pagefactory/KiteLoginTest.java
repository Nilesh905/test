package POM_Pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\client5\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://kite.zerodha.com/");
	KiteLogin1Page login1 = new KiteLogin1Page(driver);
	login1.enterUN();
	login1.enterPWD();
	login1.clickonloginButton();
	KiteLogin2Page login2 = new KiteLogin2Page(driver);
	login2.enterpin();
	login2.entercntbtn();
	KiteHomePage login3 = new KiteHomePage(driver);
	login3.verifypin();
	Thread.sleep(3000);
	driver.close();
	
	
	
	
	
}
}
