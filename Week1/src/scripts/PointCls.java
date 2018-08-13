package scripts;
//FIND X AND Y AXIS (+VE)
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PointCls {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/na2/login.do");
		WebElement ele=driver.findElement(By.id("username"));
		Point p = ele.getLocation();
		int x=p.getX();
		int y=p.getY();
		System.out.println(x+" "+y);
		driver.close();
		
		

	}

}
