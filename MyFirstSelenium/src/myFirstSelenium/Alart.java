package myFirstSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		//delete all cookies
		driver.manage().deleteAllCookies();
		//wait for page to be loaded
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(10000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("login1")).sendKeys("12304");
		
		//driver.close();
		
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.linkText("Gmail"));
		driver.quit();
		

	}

}
