package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/client5/Desktop/Nilesh velocity Notes/Selenium daily notes/Locators/ID.html");
	driver.manage().window().maximize();
	driver.findElement(By.id("1234")).sendKeys("nilesh");
	driver.findElement(By.id("567")).sendKeys("1234");
	driver.findElement(By.id("123456")).sendKeys("1010101010");
	
}
}
