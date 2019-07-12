package myFirstSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetValueFromWeb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://techfios.com/test/billing/?ng=login/");
		driver.manage().window().maximize();
		//delete all cookies
		driver.manage().deleteAllCookies();
		//wait for page to be loaded
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		//Get Value from Web
		String UserName = driver.findElement(By.id("username")).getAttribute("value");
		System.out.println("User Name Is: " + UserName);
		String PassWord = driver.findElement(By.id("password")).getAttribute("value");
		System.out.println("Password is: " + PassWord);
		
		driver.quit();
	}

}
