package basics;

public class MainClass {

	public static void main(String[] args) {
		WEBDRIVER driver=new ChromeDriver();
		driver.m1();
		driver.m2();
		JAVASCRIPTEXECUTOR jse=(JAVASCRIPTEXECUTOR) driver;
		jse.m3();
		jse.m4();
	}

}
