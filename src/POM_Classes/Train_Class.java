package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Train_Class {
	
	
	@FindBy(xpath="//span[text()='Trains']")
	private WebElement ClickTrainTab;
	
	@FindBy(xpath="//input[@data-cy='fromCity']")
	private WebElement ClickToFrom;
	@FindBy(xpath="//input[@placeholder='From']")
	private WebElement EnterFromcity;
	@FindBy(xpath="//li[@role='option']")
	private WebElement ClickFromtopsearch;
	@FindBy(xpath="	//input[@placeholder='To']")
	private WebElement EnterToCity;
	@FindBy(xpath="//li[@role='option']")
	private WebElement ClickTotopsearch;
	
	public Train_Class(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}


	public void ClickTrainTab() {
		ClickTrainTab.click();
	}
	public void ClickToFrom() {
		ClickToFrom.click();
	}
	public void Enterfromcity() {
		EnterFromcity.sendKeys("pune");
	}
	public void clickfromtopsearch() {
		ClickFromtopsearch.click();
	}
	public void ClickToCity() {
		EnterToCity.click();
	}
	public void clickTotopsearch() {
		ClickFromtopsearch.click();
	}
}
