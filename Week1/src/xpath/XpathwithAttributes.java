package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathwithAttributes {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vivian/Desktop/Xpath.html");
		driver.findElement(By.xpath("//input[@id='a4']")).sendKeys("nothing");
		Thread.sleep(2000);
		driver.close();
	}

}
