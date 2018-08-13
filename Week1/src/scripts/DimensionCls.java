package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionCls {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/na2/login.do");
		WebElement ele=driver.findElement(By.id("username"));
		Dimension s = ele.getSize();
		int h=s.getHeight();
		int w=s.getWidth();
		System.out.println("Height"+h);
		System.out.println("Width"+w);
		driver.close();
		

	}

}
