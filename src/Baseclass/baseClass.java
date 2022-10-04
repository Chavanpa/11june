package Baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseClass {
	static WebDriver driver;
	
	public static WebDriver OpenBrowser(String browser) {
		
		if(driver==null) {
			if(browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver","D:\\SoftSelenium\\chrome\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			else {
				System.setProperty("webdriver.gecko.driver", "D:\\SoftSelenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		return driver;
	}

}
