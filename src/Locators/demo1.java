package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc");
	//driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123");
 //   driver.findElement(By.name("login")).click();
	Thread.sleep(1000);
    //driver.findElement(By.xpath("//*[@id='u_0_2_OJ']")).click();
   // driver.findElement(By.xpath("//*[@id='u_0_2_OJ']/text()")).click();
	//driver.findElement(By.xpath("//*[@id='u_0_a_mQ']/div[3]/a")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Forgotten']")).click();
    
   // Forgotten password?
    
//	driver.get("https://www.youtube.com/");
//	driver.findElement(By.xpath("//*[@id='search']")).sendKeys("abc");
//	driver.findElement(By.xpath("//*[@id='search-icon-legacy']")).click();
//	//driver.findElement(By.xpath("//*[@id='metadata-line']/span[1]")).getText();
//	driver.findElement(By.xpath("//*[@id='metadata-line']")).getText();
}
}
