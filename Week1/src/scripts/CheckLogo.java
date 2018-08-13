package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckLogo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/na2/login.do");
		WebElement ele=driver.findElement(By.cssSelector("td#logoContainer>div>img"));
		boolean v = ele.isDisplayed();
		System.out.println(v);
		WebElement login = driver.findElement(By.id("loginButton"));
		boolean bool = login.isEnabled();
		System.out.println(bool);
		driver.close();
				

	}

}
