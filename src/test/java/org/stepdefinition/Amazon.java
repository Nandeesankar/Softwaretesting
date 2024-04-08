package org.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazon extends BaseClass{
	AmazonPojo a;
	@Given("To launch browser and maximize window")
	public void to_launch_browser_and_maximize_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To launch the url of amazon login page")
	public void to_launch_the_url_of_amazon_login_page() {
	    launchUrl("https://www.amazon.in/");
	}

	@When("To pass email in email field")
	public void to_pass_email_in_email_field(String email) {
	    a = new AmazonPojo();
	    passText(email, a.getEmail());
	}

	@When("Click continue")
	public void click_continue() {
		a = new AmazonPojo();
	    clickBtn(a.getConbtn());
	}

	@When("To pass password in password field")
	public void to_pass_password_in_password_field(String password) {
		a = new AmazonPojo();
		passText(password, a.getPass());
	   
	}

	@When("To click sign in")
	public void to_click_sign_in() {
		a = new AmazonPojo();
		clickBtn(a.getSignbtn());
	   
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	    
	}


}
