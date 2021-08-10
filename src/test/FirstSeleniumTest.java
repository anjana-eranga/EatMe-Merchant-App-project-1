package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("WebDriver.Chrome.driver", "C:\\chromedriver_win32");
		driver.get("https://qa_admin.eatmeglobal.org/");
		///test ....
	}
}
