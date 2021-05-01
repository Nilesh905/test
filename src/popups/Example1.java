package popups;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\client5\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Click me!'][1]")).click();
	  //driver.findElement(By.xpath("//button[text()='Click me!'][]")).click();
Alert alt = driver.switchTo().alert();
	alt.accept();
	//driver.switchTo().alert().accept();
	
}
}
