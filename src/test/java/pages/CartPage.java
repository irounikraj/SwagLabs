package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import helper.Baseclass;

public class CartPage extends Baseclass {
	CartPage cart = new CartPage();
	public By cartbtn = By.xpath("svg[class=\"svg-inline--fa fa-shopping-cart fa-w-18 fa-3x \"]");

	public void click_on_cartbtn() {
		ExplicitWait(cartbtn).click();
	}

	public void validate_cart_page() {
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://www.saucedemo.com/v1/cart.html";
		Assert.assertEquals(actualurl, expectedurl);

	}
	
	

}
