package stepDefination;

import helper.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps extends Baseclass {
	LoginPage login = new LoginPage();

	@Given("user launched site url")
	public void user_launched_site_url() {
		login.user_launched_site_url();

	}

	@Given("user entered valid username")
	public void user_entered_valid_username() {
		login.user_entered_valid_username();

	}

	@Given("user entered valid password")
	public void user_entered_valid_password() {
		login.user_entered_valid_password();

	}

	@When("click on login button")
	public void click_on_login_button() {
		login.click_on_login_button();

	}

	@Then("validate user logged successfully")
	public void validate_user_logged_successfully() {
		login.validate_user_logged_successfully();
		login.mouseHover();
		login.takeScreenshot();
		CloseBrowser();

	}

	@Given("user entered invalid username")
	public void user_entered_invalid_username() {
		login.user_entered_invalid_username();

	}

	@Given("user entered invalid password")
	public void user_entered_invalid_password() {
		login.user_entered_invalid_password();
		;
	}

	@Then("Validate error message")
	public void validate_error_message() {
		login.validate_error_message();

	}

	@Then("Validate error message with no username")
	public void validate_error_message_with_no_username() {
		login.validate_error_message_with_no_username();
		CloseBrowser();

	}

	@Then("Validate error message with no password")
	public void validate_error_message_with_no_password() {
		login.validate_error_message_with_no_password();
	}

}
