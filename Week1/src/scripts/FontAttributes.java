package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FontAttributes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/na2/login.do");
		WebElement ele=driver.findElement(By.id("username"));
		String var = ele.getCssValue("font-size");
		System.out.println(var);
		String var1 = ele.getCssValue("color");
		System.out.println(var1);
		driver.close();
	}

}
/*14px
rgba(0, 0, 0, 1)
a=0.0 to 1.0*/