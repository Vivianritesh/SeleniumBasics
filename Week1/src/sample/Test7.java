package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Vivian/Desktop/sample.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("linkedin")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
