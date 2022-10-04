package POM_Classes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	
	static WebDriver driver;
	JavascriptExecutor js=(JavascriptExecutor)driver;
	@FindBy(xpath="//li[@data-cy='account']")
	private WebElement CreateAccount;
	
	@FindBy(xpath="//input[@placeholder='Enter email or mobile number']")
	private WebElement EnterEmailId;
	@FindBy(xpath="//button[@class='capText font16']")
	private WebElement continuebtn;
	@FindBy(xpath="//input[@type='password']")
	private WebElement EnterPass;
	@FindBy(xpath="//span[@id='auth-signin-button']")
	private WebElement Clicksignbtn;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
   public void clicksignbutton() {
	   CreateAccount.click();
   }
   public void Enteremailid() {
	   EnterEmailId.sendKeys("chavanpopat1990@gmail.com");
   }
   public void clickcontinuebtn() {
	   js.executeScript("arguments[0].click();", continuebtn);
	   //continuebtn.click();
   }
   public void Enterpswd() {
	   EnterPass.sendKeys("Chavan@99");
   }
   public void clicksignbtn() {
	   Clicksignbtn.click();
   }
	
	

}
