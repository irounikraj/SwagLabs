package stepDefination;

import helper.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CartPage;

public class CartSteps extends Baseclass {
	CartPage cart = new CartPage();

	@Given("Click on cartbtn")
	public void click_on_cartbtn() {
		cart.click_on_cartbtn();

	}

	@Then("Validate cart page")
	public void validate_cart_page() {
		cart.validate_cart_page();

	}
}
