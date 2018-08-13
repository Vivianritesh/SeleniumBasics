package javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DELETING {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		driver.get("file:///C:/Users/Vivian/Desktop/NOconnection.html");
		WebElement b = driver.findElement(By.id("2"));
		String str1="arguments[0].value='"+"Vivian"+"'";
		jse.executeScript(str1, b);
		Thread.sleep(2000);
		String str2="arguments[0].value=''";
		jse.executeScript(str2, b);
		Thread.sleep(3000);
		driver.close();
	}

}
