package weekendDebug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vtiger {

	public static void main(String[] args) throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/");
		
		Test.maximizeWindow(driver);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
