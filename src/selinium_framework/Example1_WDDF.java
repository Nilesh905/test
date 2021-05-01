package selinium_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example1_WDDF 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\client5\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver() ;
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

driver.get("https://kite.zerodha.com/");
driver.manage().window().maximize();
//step1: enter UN
driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");
// step2: enter PWD
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vijay@123");
//step3: click on login button
driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
//step4: enter pin
driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
//step5: click on continue btn
driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
String ActUserId = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
//String expUserId="DV1510";
String expUserID = "DV1510";
//(expUserId.equals(ActUserId))
if( expUserID.equals(ActUserId))
		{
			System.out.println("pass");
		}
 else
{
	System.out.println("fail");
}
Thread.sleep(2000);
driver.close();











}
}
