package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_getTotalNoOfLinksPresentInWebpage 
{
public static void main (String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\client5\\Downloads\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(2000);
//List<WebElement> findelements = driver.findElements(By.xpath("//a"));
//System.out.println( findelements.size());
	int size = driver.findElements(By.xpath("//a")).size();
	System.out.println(size);
	
	
	
}
}
