package myFirstSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewToursDemo {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		//delete all cookies
		driver.manage().deleteAllCookies();
		//wait for page to be loaded
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Mahbubur");
		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Rahman");
		driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("7189476499");
		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("alvee01@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("8617 Sabinal trail");
		driver.findElement(By.name("city")).sendKeys("Fort Worth");
		driver.findElement(By.name("postalCode")).sendKeys("76118");
		WebElement ele = driver.findElement(By.name("country"));
		Select select = new Select(ele);
		select.selectByVisibleText("UNITED STATES");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("alvee01@gmail.com");
		driver.findElement(By.name("password")).sendKeys("mahbub");
		driver.findElement(By.name("confirmPassword")).sendKeys("mahbub");
		driver.findElement(By.name("register")).click();
	}

}
