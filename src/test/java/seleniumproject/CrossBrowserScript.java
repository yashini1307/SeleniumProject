package seleniumproject;

 


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserScript {

WebDriver driver;

/**
* This function will execute before each Test tag in testng.xml
* @param browser
* @throws Exception
*/
@BeforeTest
@Parameters("browser")
public void setup(String browser) throws Exception{
//Check if parameter passed from TestNG is 'firefox'
if(browser.equalsIgnoreCase("firefox")){
//create firefox instance
System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\yashinir\\\\eclipse-workspace_selenium\\\\seleniumProject\\\\drivers\\\\geckodriver.exe");
driver = new FirefoxDriver();
}

//Check if parameter passed as 'chrome'
else if (browser.equalsIgnoreCase("chrome")){
//set path to chromedriver.exe
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\yashinir\\\\eclipse-workspace_selenium\\\\seleniumProject\\\\drivers\\\\chromedriver.exe");
driver = new ChromeDriver();

}
else{
//If no browser passed throw exception
throw new Exception("Browser is not correct");
}
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@Test
public void testParameterWithXML() throws InterruptedException{
driver.get("https://opensource-demo.orangehrmlive.com/");

if(driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[@id='divLogin']/div[@id='divLogo']/img[1]")).isDisplayed())
{
System.out.println("Image is present");
}
else {
System.out.println("Image is not present");
}

WebElement uname = driver.findElement(By.id("txtUsername"));
uname.sendKeys("Admin");
Thread.sleep(2000);
WebElement passwd = driver.findElement(By.id("txtPassword"));
passwd.sendKeys("admin123");
WebElement submit = driver.findElement(By.id("btnLogin"));
submit.click();
//driver.findElement(By.xpath("//b[contains(text(),'Dashboard')]")).click();
//driver.findElement(By.id("menu_admin_viewAdminModule")).click();

WebElement class1 = driver.findElement(By.id("menu_dashboard_index"));
class1.click();
Thread.sleep(2000);
 

WebElement class2 = driver.findElement(By.cssSelector("div.box:nth-child(3) div.inner div.outerbox.no-border:nth-child(1) div.maincontent.group-wrapper div.panel_wrapper div.panel_draggable.panel-preview fieldset.panel_resizable.panel-preview table.quickLaungeContainer tr:nth-child(1) td:nth-child(3) div.quickLaunge a:nth-child(1) > img:nth-child(1)"));
class2.click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='employee']")).click();
Thread.sleep(2000);

WebElement class3 = driver.findElement(By.id("employee"));
class3.sendKeys("Garry White");
Thread.sleep(2000);

driver.findElement(By.id("btnView")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//select[@id='startDates']")).click();
Thread.sleep(2000);

Select drpdate = new Select (driver.findElement(By.xpath("//select[@id='startDates']")));
drpdate.selectByValue("3");
Thread.sleep(2000);
driver.findElement(By.cssSelector("#btnEdit")).click();
Thread.sleep(2000);


//click on select
driver.findElement(By.xpath("//select[@id='initialRows_0_projectActivityName']")).click();
Thread.sleep(2000);

Select drpdate1 = new Select (driver.findElement(By.xpath("//select[@id='initialRows_0_projectActivityName']")));
drpdate1.selectByValue("67");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='initialRows_0_1']")).clear();
WebElement date1 = driver.findElement(By.xpath("//input[@id='initialRows_0_1']"));
date1.sendKeys("2:00");
Thread.sleep(2000);

driver.findElement(By.xpath("//input[@id='submitSave']")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//b[contains(text(),'Dashboard')]")).click();
Thread.sleep(2000);

driver.findElement(By.id("menu_buzz_viewBuzz")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//textarea[@id='createPost_content']")).sendKeys("Hello");
Thread.sleep(2000);

driver.findElement(By.cssSelector("#tabLink2")).click();
Thread.sleep(2000);


WebElement uploadimage = driver.findElement(By.xpath("//input[@id='image-upload-button']"));//upload image button
uploadimage.click();
Thread.sleep(3000);

WebElement photo = driver.findElement(By.xpath("//form[@id='frmUploadImage']/fieldset/ol/li[2]/input"));
photo.sendKeys("C:\\Users\\yashinir\\Pictures\\Screenshots\\Screenshot (116).png");//photo or file location

//photo.click
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='imageUploadBtn']")).click();
Thread.sleep(2000);
driver.findElement(By.id("welcome")).click();
Thread.sleep(2000);
driver.findElement(By.linkText("Logout")).click();

driver.quit();
}

}