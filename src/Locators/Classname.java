package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classname 
{
public static void main(String[] args) 
{

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://en-gb.facebook.com/");
		driver.get("file:///C:/Users/client5/Desktop/Nilesh velocity Notes/Selenium daily notes/Locators/ClassName.html");

		// enter UN
	//	driver.findElement(By.className("abc")).sendKeys("abc");
 WebElement UN = driver.findElement(By.className("abc"));
 UN.sendKeys("ABC");
		// enter PWD
	//	driver.findElement(By.className("xyz")).sendKeys("xyz");
WebElement PWD = driver.findElement(By.className("xyz"));
PWD.sendKeys("XYZ");

		// enter contact
	//	driver.findElement(By.className("abc")).sendKeys("9999999999");

}
}