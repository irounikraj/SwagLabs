package stepDefination;

import helper.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckoutPage;

public class CheckoutSteps extends Baseclass {
	CheckoutPage chckout = new CheckoutPage();

	@When("Click on Checkout Button")
	public void click_on_checkout_button() {
		chckout.click_on_checkout_button();
	}

	@Then("Validate Checkout Page")
	public void validate_checkout_page() {
		chckout.validate_checkout_page();
	}

	@Then("user enters {string} {string} {string}")
	public void user_enters(String checkoutfname, String checkoutlname, String checkoutzipcode) {
		chckout.user_enters(checkoutfname, checkoutlname, checkoutzipcode);
	}

}
