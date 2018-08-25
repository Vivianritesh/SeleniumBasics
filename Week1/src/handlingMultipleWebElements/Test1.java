package handlingMultipleWebElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Vivian/Desktop/NOconnection.html");
		List<WebElement> chkbx = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count = chkbx.size();
		System.out.println("No of Check Boxes = "+count);
		for (int i = 0; i < count; i++) {
			chkbx.get(i).click();
			Thread.sleep(2000);
		}
		for (int i = count-1; i >=0; i--) {
			chkbx.get(i).click();
			Thread.sleep(2000);
		}
		driver.close();

	}

}
