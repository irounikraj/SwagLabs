package pages;

import org.junit.Assert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Baseclass;

public class PLPPage extends Baseclass {
	public By LeftSideButton = By.cssSelector("div.bm-burger-button");
	public By all_items_btn = By.cssSelector("a#inventory_sidebar_link");
	public By about_btn = By.cssSelector("a#about_sidebar_link");
	public By logoutbtn = By.cssSelector("a#logout_sidebar_link");

	public void click_on_a_product() {
		driver.findElement(By.cssSelector("a#item_4_title_link")).click();
		takeScreenshot();
		// driver.findElement(By.xpath("#inventory_item_container > div >
		// button")).click();
		driver.navigate().back();
	}

	public void validate_price_of_product() {
		String price = driver
				.findElement(By.cssSelector("#inventory_container > div > div:nth-child(1) > div.pricebar > div"))
				.getText();
		System.out.println("price of product" + price);
	}

	public void click_on_add_to_cart_button() {
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();

	}

	public void validate_product_added_to_cart() {
		WebElement ele = driver.findElement(By.cssSelector("span[class=\"fa-layers-counter shopping_cart_badge\"]"));

		System.out.println("counter:" + ele.getText());
		CloseBrowser();

	}

	public void click_on_all_product_one_by_one() {
		List<WebElement> allpro = driver.findElements(By.className("inventory_item_name"));
		System.out.println("total products are" + allpro.size());

		for (int i = 0; i < allpro.size(); i++) {
			allpro.get(i).click();

			System.out.println("the window handles are: " + "  " + driver.getWindowHandle());

			System.out.println(
					"price " + " " + driver.findElement(By.cssSelector("div.inventory_details_price")).getText());
			System.out.println(" description: " + " "
					+ driver.findElement(By.cssSelector("div.inventory_details_desc")).getText());
			driver.navigate().back();

		}

	}

	public void click_on_leftsidebutton_on_plp_page() {
		ExplicitWait(LeftSideButton).click();

	}

	public void validate_options_available() {
		List<WebElement> allopt = driver.findElements(By.xpath("a[class=\"bm-item menu-item\"]"));
		System.out.println("the no. of options after clicking left side button are" + allopt.size());
		CloseBrowser();

	}

	public void click_on_all_items_btn() {
		ExplicitWait(all_items_btn).click();

	}

	public void validate_product_page() {
		String product_label = driver.findElement(By.cssSelector("div.product_label")).getText();
		// assertTrue(product_label == "Products");
		String expected = "Products";
		Assert.assertEquals(product_label, expected);
		CloseBrowser();

	}

	public void click_on_about_btn() {
		ExplicitWait(about_btn).click();

	}

	public void validate_about_page() {
		String aboutpageurl = driver.getCurrentUrl();
		String expected = "https://saucelabs.com/";
		Assert.assertEquals(aboutpageurl, expected);

		CloseBrowser();

	}

	public void click_on_logout_btn() {
		ExplicitWait(logoutbtn).click();

	}

	public void validate_logout() {
		String pageurl = driver.getCurrentUrl();
		String expected = "https://www.saucedemo.com/v1/index.html";
		Assert.assertEquals(pageurl, expected);

		CloseBrowser();

	}

}
