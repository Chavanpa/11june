package testClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseclass.baseClass;
import POM_Classes.Train_Class;

public class testclass2 {
	static WebDriver driver;
	Train_Class TC;
	
	
	@BeforeClass
	@Parameters("browser")
	public void beforeclass(String browser) {
		driver=baseClass.OpenBrowser(browser);
	}
	@BeforeMethod
	public void beforemethod() {
		TC=new Train_Class(driver);
	}
	
	@Test(priority=3)
	public void test1() throws InterruptedException  {
		TC.ClickTrainTab();
		TC.ClickToFrom();
		Thread.sleep(2000);
		TC.Enterfromcity();
		TC.clickfromtopsearch();
		TC.clickTotopsearch();
	}
	@AfterMethod
	public void aftermethod() {
		
	}
	@AfterClass
	public void afterclass() {
		
	}
}
