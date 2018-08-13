package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Vivian/Desktop/sample.html");
		driver.manage().window().maximize();
		
		
        driver.findElement(By.partialLinkText("facebook")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        
        
        driver.findElement(By.partialLinkText("twit")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        
        driver.findElement(By.partialLinkText("gram")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        
        Thread.sleep(3000);
        driver.close();
        
	}

}
