package scripts;
//ENTER AND DELETE CHARACTERS ONE BY ONE
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sun1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/na2/login.do");
		WebElement ele=driver.findElement(By.id("username"));
		ele.sendKeys("Vivian");
		String str=ele.getAttribute("placeholder");
		System.out.println(str);
		int count=str.length();
		for(int i=0;i<=count;i++)
		{
			Thread.sleep(1000);
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		driver.close();

	}

}
