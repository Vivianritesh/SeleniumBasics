package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vivian/Desktop/Xpath.html");
		driver.findElement(By.xpath("//div[1]/input[2]")).sendKeys("anything");
		Thread.sleep(3000);
		driver.close();
	}

}
