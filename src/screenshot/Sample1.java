package screenshot;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Sample1 
{
public static void main(String[] args) throws IOException 
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\client5\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
File  source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 System.out.println(source);
File dest=new File("C:\\Users\\client5\\Desktop\\Nilesh velocity Notes\\Selenium daily notes\\Screenshot\\abc.jpg");
 FileHandler.copy(source,dest);

}
}
