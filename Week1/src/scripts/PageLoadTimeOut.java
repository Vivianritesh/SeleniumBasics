package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		try {
			driver.get("https://online.actitime.com/na2/login.do");
			System.out.println("page is loaded within time");
		} catch (Exception e) {
			System.out.println("Page is not Loaded within time");
			e.printStackTrace();
		}
		driver.manage().deleteAllCookies();
		driver.close();

	}

}
