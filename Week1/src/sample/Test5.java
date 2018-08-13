package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;


public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
			
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Vivian/Desktop/sample.html");
			driver.manage().window().maximize();
			String str="Vivian";
			driver.findElement(By.name("n2")).sendKeys(str);
			Thread.sleep(1000);
			
			driver.findElement(By.className("c3")).sendKeys(str);
			Thread.sleep(1000);
			
			driver.close();
			
			
		

	}

}
