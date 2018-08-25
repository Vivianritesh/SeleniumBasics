package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	@Test
	public void test1() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vivian/Desktop/NOconnection.html");
		SupportDemo demo= new SupportDemo(driver);
		demo.textbox().sendKeys("Test");
		Thread.sleep(2000);
		driver.close();
		
	}
}
