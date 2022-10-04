package Baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\SoftSelenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	WebDriver	driver = new FirefoxDriver();


	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}
