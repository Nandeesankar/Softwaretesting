package org.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class mail extends BaseClass{
	GmailPojo g;
	@Given("To launch the browser and maximise the window")
	public void to_launch_the_browser_and_maximise_the_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To launch the Url of the Gmail")
	public void to_launch_the_Url_of_the_Gmail() {
	    launchUrl("https://accounts.google.com/");
	}

	@When("To pass the data in {string} in email field")
	public void to_pass_the_data_in_in_email_field(String em) {
	    g = new GmailPojo();
	    passText(em,g.getEmail());
	}

	@When("click next")
	public void click_next() {
		g = new GmailPojo();
		clickBtn(g.getBtn()); 
	}
	@Then("close the browser")
	public void close_the_browser() {
	   
	}


}
