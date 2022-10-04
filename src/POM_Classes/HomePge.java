package POM_Classes;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePge {
	@FindBy(xpath="//span[@class='langCardClose']")
	private WebElement CloseAdd;
	@FindBy(xpath="//li[@data-cy='roundTrip']")
	private WebElement Selectroundtrip;
	@FindBy(xpath="//label[@for='fromCity']")
	private WebElement clickfromlabel;
	@FindBy(xpath="//input[@placeholder='From']")
	private WebElement Enterfrom;
	@FindBy(xpath="//li[@role='option']")
	private WebElement Clicktopserch;
	@FindBy(xpath="//input[@placeholder='To']")
	private WebElement Enterto;
	@FindBy(xpath="//li[@role='option']")
	private WebElement ClickTotopserch;
	@FindBy(xpath="//p[text()='8']")
	private WebElement SelectFromDate;
	@FindBy(xpath="//p[text()='10']")
	private WebElement SelectToDate;
	@FindBy(xpath="//div[@data-cy='flightTraveller']")
	private WebElement ClickFlighttraveller;
	@FindBy(xpath="//li[text()='2'][1]")
	private WebElement SelectAdult;
	@FindBy(xpath="//li[text()='1']")
	private WebElement SelectChild;
	@FindBy(xpath="//li[text()='Premium Economy']")
	private WebElement ClickPremEcon;
	@FindBy(xpath="//p[text()='Student ']")
	private WebElement Selectstdnt;
	@FindBy(xpath="//a[text()='Search']")
	private WebElement clicksearchbtn;
	
	
	
	@FindBy(xpath="//button[text()='APPLY']")
	private WebElement ClickApplybtn;
	
	
	public HomePge(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void CloseAdd() {
		CloseAdd.click();
	}
	public void searchinput() {
		Selectroundtrip.click();
	}
	public void ClickFromlbl() {
		clickfromlabel.click();
	}
	public void EnterFrom() {
		Enterfrom.sendKeys("Mumbai");
	}
	public void clicktopsearch() {
		Clicktopserch.click();
	}
	public void EnterTo() {
		Enterto.sendKeys("Delhi");
	}
	public void clickTotopsearch() {
		ClickTotopserch.click();
	}
	public void clickfromdate() {
		SelectFromDate.click();
	}
	public void clickTodate() {
		SelectToDate.click();
	}
	public void SelectAdults() {
		SelectAdult.click();
	}
	public void SelectChild() {
		SelectChild.click();
	}
	public void SelectInfalts() {
		ClickPremEcon.click();
	}
	public void ClickFlighttraveller() {
		ClickFlighttraveller.click();
	}
	public void Clickapplybtn() {
		ClickApplybtn.click();
	}
	public void Clickselectrdiobtn() {
		Selectstdnt.click();
	}
	public void Clicksearchbtn() {
		clicksearchbtn.click();
	}


}
