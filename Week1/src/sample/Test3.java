package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Vivian/Desktop/sample.html");
		driver.manage().window().maximize();
		String str="Courseube";
		
		/*By b=By.id("a1");
		driver.findElement(b);
		WebElement ele= driver.findElement(b);*/
		
		driver.findElement(By.id("a1")).sendKeys(str);
		
		/*ele.clear();
		ele.sendKeys(str);*/
		Thread.sleep(3000);
		driver.close();
		

	}

}
