package javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CLICK {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/na2/login.do");
		driver.findElement(By.id("username")).sendKeys("riteshvivian");
		driver.findElement(By.name("pwd")).sendKeys("ka03je1659");
		WebElement login = driver.findElement(By.id("loginButton"));
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		String str="arguments[0].click();";
		jse.executeScript(str, login);
		Thread.sleep(3000);
		driver.close();

	}

}
