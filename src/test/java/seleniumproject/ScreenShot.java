package seleniumproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	 
	 public static void main(String[] args) throws IOException {

	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\yashinir\\\\eclipse-workspace_selenium\\\\seleniumProject\\\\drivers\\\\chromedriver.exe\")";"
	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");



	 
	File source_file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source_file, new File("C:\\Users\\shriramsv\\eclipse-workspace-MavenSelenium\\MavenSeleniumProject\\src\\test\\java\\com\\picnic\\selenium1"+".jpg"));
	 
	 driver.quit();
	 }
}
