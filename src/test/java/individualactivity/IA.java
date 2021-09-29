package individualactivity;
import org.openqa.selenium.*;


import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class IA {
	public static void main(String[] args) throws InterruptedException{




		 System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\yashinir\\\\eclipse-workspace_selenium\\\\seleniumProject\\\\drivers\\\\chromedriver.exe");


		 //chrome web driver instance


		 WebDriver driver = new ChromeDriver();


		 driver.get("https://www.saucedemo.com/");


		 driver.manage().window().maximize();

		 WebElement uname = driver.findElement(By.id("user-name"));


		 uname.sendKeys("standard_user");

		 Thread.sleep(2000);


		WebElement passwd = driver.findElement(By.xpath("//input[@id='password']"));

		 passwd.sendKeys("secret_sauce");


		 WebElement submit = driver.findElement(By.id("login-button"));

		 submit.click();

		 Thread.sleep(2000);


		 if(driver.findElement(By.className("app_logo")).isDisplayed())

		 {

		 System.out.println("Text is present");

		 }

		 else {

		 System.out.println("Text is absent");

		 }

		 driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt")).click();

		 Thread.sleep(2000);

		 driver.findElement(By.cssSelector("div.page_wrapper div:nth-child(1) div.header_container:nth-child(1) div.primary_header div.shopping_cart_container:nth-child(3) > a.shopping_cart_link")).click();

		 Thread.sleep(2000);

		driver.findElement(By.id("checkout")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("yash");

		Thread.sleep(2000);

		driver.findElement(By.id("last-name")).sendKeys("R");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("1234");

		Thread.sleep(2000);

		driver.findElement(By.id("continue")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='finish']")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("back-to-products")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("react-burger-menu-btn")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("logout_sidebar_link")).click();

		Thread.sleep(2000);

		Select logout = new Select(driver.findElement(By.id("logout_sidebar_link")));

		logout.selectByVisibleText("LOGOUT");

		 }

}
