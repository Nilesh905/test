package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name 
{
	public static void main(String[] args) 
	{
		
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/client5/Desktop/Nilesh velocity Notes/Selenium daily notes/Locators/Name.html");
driver.findElement(By.name("abc1")).sendKeys("nilesh");
driver.findElement(By.name("xyz1")).sendKeys("280494");
driver.findElement(By.className("abc")).sendKeys("75880531");
}
}