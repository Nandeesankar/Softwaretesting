package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPojo extends BaseClass {
	
	public GmailPojo() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "identifierId")
	private WebElement email;
	
	@FindBy(xpath = "(//span[@class='VfPpkd-vQzf8d'])[4]")
	private WebElement btn;
	
	@FindBy(xpath = "(//input[@class='whsOnd zHQkBf'])[1]")
	private WebElement pass;
	
	@FindBy(xpath = "(//span[@class='VfPpkd-vQzf8d'])[4]")
	private WebElement btn1;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getBtn() {
		return btn;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getBtn1() {
		return btn1;
	}
	
	
	
	
	


}
