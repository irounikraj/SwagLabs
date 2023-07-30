package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import helper.Baseclass;
import junit.framework.Assert;

public class CheckoutPage extends Baseclass {
	public By checkoutBtn = By.xpath("a[class=\"btn_action checkout_button\"]");
	public By checkoutheader = By.cssSelector("div.subheader");
	//public By checkoutfname = By.xpath("//*[@id=\"first-name\"]");
	//public By checkoutlname = By.cssSelector("input#last-name");
	//public By checkoutzipcode = By.cssSelector("input#postal-code");

	public void click_on_checkout_button() {
		ExplicitWait(checkoutBtn).click();
	}

	@SuppressWarnings("deprecation")
	public void validate_checkout_page() {
		String actual = ExplicitWait(checkoutheader).getText();
		String expected = "Checkout: Your Information";
		Assert.assertEquals(expected, actual);

	}

	public void user_enters(String checkoutfname, String checkoutlname, String checkoutzipcode) {
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys(checkoutfname);
		driver.findElement(By.cssSelector("input#last-name")).sendKeys(checkoutlname);
		driver.findElement(By.cssSelector("input#postal-code")).sendKeys(checkoutzipcode);

	}

}
