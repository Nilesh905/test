package WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class example4_getTitle
{
public static void main(String[] args) throws InterruptedException 
{
	String expresult = "Google";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\client5\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
Thread.sleep(1000);
//String actresult = driver.getTitle();
//System.out.println(actresult);
//if (actresult.equals(expresult))
//{
//	System.out.println("pass");
//}
//else
//{
//System.out.println("fail");	
//}
}
}
