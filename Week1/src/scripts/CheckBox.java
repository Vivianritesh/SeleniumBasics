package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		//remember
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/na2/login.do");
		WebElement ele=driver.findElement(By.name("remember"));
		boolean v = ele.isSelected();
		System.out.println(v);
		driver.close();
		

	}

}
