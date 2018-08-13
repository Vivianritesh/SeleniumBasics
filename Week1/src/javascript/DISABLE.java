package javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DISABLE {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		driver.get("file:///C:/Users/Vivian/Desktop/NOconnection.html");
		Thread.sleep(3000);
		//WebElement b = driver.findElement(By.id("1"));
		String str="document.getElementById('1').value='Vivian'";
		jse.executeScript(str);
		Thread.sleep(3000);
		driver.close();

	}

}
