package seleniumproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
import seleniumproject.LoginPage;
 
/**
* @author Mukesh_50
*
*/
public class VerifyWordpressLogin {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\yashinir\\eclipse-workspace_selenium\\seleniumProject\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("https://opensource-demo.orangehrmlive.com/");
	 
	LoginPage login=new LoginPage(driver);
	login.typeUserName("Admin");
	Thread.sleep(2000);		
	login.typePassword("admin123");
	Thread.sleep(2000);
	
	login.clickOnLoginButton();
	 
	 driver.quit();
	}
}
