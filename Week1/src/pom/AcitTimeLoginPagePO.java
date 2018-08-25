package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AcitTimeLoginPagePO {
	private WebElement logoutLink;
	public AcitTimeLoginPagePO(WebDriver driver) {
		logoutLink=driver.findElement(By.id("logoutLink"));
	}
	public void ClickOnlogout() {
		logoutLink.click();
	}
}
