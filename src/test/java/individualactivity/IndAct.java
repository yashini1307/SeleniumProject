package individualactivity;

import org.openqa.selenium.*;


import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class IndAct {
	
	public static void main(String[] args) throws InterruptedException{

		 System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\yashinir\\\\eclipse-workspace_selenium\\\\seleniumProject\\\\drivers\\\\chromedriver.exe");

		 //chrome web driver instance


		 WebDriver driver = new ChromeDriver();


		 driver.get("https://www.saucedemo.com/");


		 driver.manage().window().maximize();
		 
		 WebElement uname = driver.findElement(By.id("user-name"));
			uname.sendKeys("standard_user");
			Thread.sleep(2000);
			WebElement passwd = driver.findElement(By.id("password"));
			passwd.sendKeys("secret_sauce");
			WebElement submit = driver.findElement(By.id("login-button"));
			submit.click();
			
			driver.findElement(By.xpath("//div[@id='menu_button_container']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bike-light']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//span[contains(text(),'1')]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@id='checkout']")).click();
			Thread.sleep(2000);
			
			WebElement Fname = driver.findElement(By.id("first-name"));
			Fname.sendKeys("Yash");
			Thread.sleep(2000);
			WebElement Lname = driver.findElement(By.id("last-name"));
			Lname.sendKeys("R");
			Thread.sleep(2000);
			WebElement Zcode = driver.findElement(By.id("postal-code"));
			Zcode.sendKeys("600118");
			Thread.sleep(2000);
			
			driver.findElement(By.id("continue")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@id='finish']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("back-to-products")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
			Thread.sleep(2000);
			
		}


}
