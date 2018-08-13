package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathwithContainsFunction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vivian/Desktop/Xpath.html");
		driver.findElement(By.xpath("//a[contains(text(),'kedin')]")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    driver.findElement(By.xpath("//input[contains(@id,'a4')]")).sendKeys("Something");
	    Thread.sleep(2000);
	    driver.close();

	}

}
