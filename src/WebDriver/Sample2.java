package WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 
{
public static void main (String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\client5\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
//	driver.findElement(By.xpath("//a[@class ='_42ft _4jy0 _55pi _2agf _4o_4 _63xb _p _4jy3 _517h _51sy'])").cl
	
}
}
