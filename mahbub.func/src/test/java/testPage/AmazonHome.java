package testPage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonHome {
	
	public static WebDriver driver;
	public static void captureScreenShot(WebDriver driver, String screenShotName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("./Screenshot/" +screenShotName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@BeforeMethod
	public static void intil(){
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.get("https://www.amazon.com/");
		
	}
	
	@Test(priority=1)
	public static void HomePage () {
		
		driver.findElement(By.id("nav-your-amazon")).click();
		driver.findElement(By.name("email")).sendKeys("alvee01@gmail.com");
		driver.findElement(By.name("password")).sendKeys("112101");
		driver.findElement(By.id("signInSubmit")).click();
		captureScreenShot(driver,"Home Page");
		


	}
	@Test(priority=2)
	public static void LoginPage(String screenShotName) {
		HomePage();
		
		driver.findElement(By.xpath("//*[@id=\"auth-warning-message-box\"]/div/h4")).isDisplayed();
		System.out.println("Login fail");
		boolean ble = driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div[1]/div/a/i")).isDisplayed();
		Assert.assertTrue(ble);
		captureScreenShot(driver,"Login Page");
	}
	@AfterMethod
	public static void Teardown() {
		driver.quit();
	}
	
	

}
