package stepDefination;

import helper.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.PLPPage;

public class PLPSteps extends Baseclass {
	PLPPage plppage = new PLPPage();

	@Given("click on a product")
	public void click_on_a_product() {
		plppage.click_on_a_product();

	}

	@Given("click on add to cart button")
	public void click_on_add_to_cart_button() {
		plppage.click_on_add_to_cart_button();

	}

	@Then("validate product added to cart")
	public void validate_product_added_to_cart() {
		plppage.validate_product_added_to_cart();

	}

	@Then("validate price of product")
	public void validate_price_of_product() {
		plppage.validate_price_of_product();

	}

	@Given("click on all product one by one")
	public void click_on_all_product_one_by_one() {
		plppage.click_on_all_product_one_by_one();
	}

	@Then("click on leftsidebutton on PLPPage")
	public void click_on_leftsidebutton_on_plp_page() {
		plppage.click_on_leftsidebutton_on_plp_page();
	}

	@Then("validate options available")
	public void validate_options_available() {
		plppage.validate_options_available();

	}

	@Then("click on AllItems btn")
	public void click_on_all_items_btn() {
		plppage.click_on_all_items_btn();

	}

	@Then("validate product page")
	public void validate_product_page() {
		plppage.validate_product_page();

	}

	@Then("click on About btn")
	public void click_on_about_btn() {
		plppage.click_on_about_btn();

	}

	@Then("validate about page")
	public void validate_about_page() {
		plppage.validate_about_page();

	}

	@Then("click on Logout btn")
	public void click_on_logout_btn() {
		plppage.click_on_logout_btn();

	}

	@Then("validate logout")
	public void validate_logout() {
		plppage.validate_logout();

	}
}