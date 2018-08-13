package javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TYPING {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		driver.get("https://online.actitime.com/na2/login.do");
		
		WebElement user = driver.findElement(By.id("username"));
		String str1 = "arguments[0].value='"+"riteshvivian"+"'";
		jse.executeScript(str1, user);
		
		WebElement pass = driver.findElement(By.name("pwd"));
		
		WebElement login = driver.findElement(By.id("loginButton"));
	}

}
