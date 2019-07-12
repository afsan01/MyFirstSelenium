package myFirstSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextExample {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","C:\\Driver\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		//delete all cookies
		driver.manage().deleteAllCookies();
		//wait for page to be loaded
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("REGISTER")).click();
		//driver.findElement(By.linkText("REGISTER")).isDisplayed();
		boolean q = driver.findElement(By.linkText("REGISTER")).isDisplayed();
		System.out.println("Register link is displayes:"  + q);
		
		Thread.sleep(1000);
		driver.quit();

	}

}
