package sample; 
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class Testweek1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		Dimension dim=new Dimension(300,400);
		driver.manage().window().setSize(dim);
		Thread.sleep(1000);
		
		Point p=new Point(300,400);
		driver.manage().window().setPosition(p);
		Thread.sleep(1000);
		
		driver.quit();

	}

}
