package testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseclass.baseClass;
import POM_Classes.HomePge;
import POM_Classes.LoginPage;
import POM_Classes.Train_Class;

public class testclass1 {
	static WebDriver driver;
	LoginPage lp;
	HomePge hp;

	@BeforeClass
	@Parameters("browser")
	public void beforeclass(String browser) {
		
		driver=baseClass.OpenBrowser( browser);
	}
	@BeforeMethod
	public void beforeMethod() {
		lp=new LoginPage(driver);
		hp=new HomePge(driver);
	
	}
	@Test(priority=1)
	public void test() throws InterruptedException {		
		
//		lp.clicksignbutton();
//	    lp.Enteremailid();
//		lp.clickcontinuebtn();
//		lp.Enterpswd();
//		lp.clicksignbtn();
	}
	@Test(priority=2)
	public void test1() throws InterruptedException {
		//hp.CloseAdd();
		hp.searchinput();
		hp.ClickFromlbl();
		hp.EnterFrom();
		hp.clicktopsearch();
		
		hp.EnterTo();
		Thread.sleep(2000);
		hp.clickTotopsearch();
		hp.clickfromdate();
		hp.clickTodate();
		hp.ClickFlighttraveller();
		hp.SelectAdults();
		hp.SelectChild();
		hp.SelectInfalts();
		hp.Clickapplybtn();
		hp.Clickselectrdiobtn();
		//hp.Clicksearchbtn();
	}
	@AfterMethod
	public void aftermethod() {
		
	}
	@AfterClass
	public void afterclass() {
		
	}

}
