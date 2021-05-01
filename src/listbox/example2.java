package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\client5\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver  = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@id='u_0_2_ow']")).click();





}
}
