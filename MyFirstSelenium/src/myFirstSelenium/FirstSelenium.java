package myFirstSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Driver\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.objectspy.com/register/signup.php");
		driver.manage().window().maximize();
		//delete all cookies
		driver.manage().deleteAllCookies();
		//wait for page to be loaded
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).sendKeys("alvee01@gmail.com");
		driver.findElement(By.name("password")).sendKeys("112101");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[3]/div/div[6]/div/div[2]/div/div/div/p/a")).click();
		driver.findElement(By.id("send")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[3]/div[1]/div/div[2]/table/tbody/tr[3]/td/a")).click();
		driver.findElement(By.cssSelector("#player > div.vp-controls-wrapper > div.vp-controls > button > div.play-icon > svg > polygon")).click();
		driver.quit();
	}
	
}
