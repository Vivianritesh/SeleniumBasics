package scripts;
//COPY PASTE FROM ONE TXTBOX TO ANOTHER
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/na2/login.do");
		WebElement ele=driver.findElement(By.id("username"));
		ele.sendKeys("Vivian");
		WebElement ele2 = driver.findElement(By.name("pwd"));
		ele.sendKeys(Keys.CONTROL+"a");
		ele.sendKeys(Keys.CONTROL+"c");
		ele2.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(3000);
		driver.close();
	}

}
