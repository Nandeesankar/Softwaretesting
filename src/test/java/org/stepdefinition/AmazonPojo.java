package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends BaseClass{
	
	public AmazonPojo() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "ap_email")
	private WebElement email;
	
	@FindBy(id = "continue")
	private WebElement conbtn;
	
	@FindBy(id = "ap_password")
	private WebElement pass;
	
	@FindBy(id ="signInSubmit")
	private WebElement signbtn;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getConbtn() {
		return conbtn;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSignbtn() {
		return signbtn;
	}
	
	
	

}
