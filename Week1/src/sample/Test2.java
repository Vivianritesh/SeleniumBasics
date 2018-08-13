package sample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Vivian/Desktop/sample.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String str=driver.getTitle();
		System.out.println("Title is "+str);
		Thread.sleep(1000);
		
		String url=driver.getCurrentUrl();
		System.out.println("URL is: "+url);
		Thread.sleep(1000);
		
		String ps =driver.getPageSource();
		System.out.println("PageSource: "+ps);
		Thread.sleep(1000);
		driver.close();
		

	}

}
