package pages;

import org.openqa.selenium.By;
import helper.Baseclass;

public class LoginPage extends Baseclass {
	public By validusername = By.cssSelector("input#user-name");
	public By validpassword = By.cssSelector("input#password");
	public By loginbtn = By.cssSelector("input#login-button");
	public By loginerrormsg = By.xpath("//*[@id=\"login_button_container\"]/div/form/h3");

	public void user_entered_valid_username() {
		
		// driver.findElement(By.cssSelector("input#user-name")).sendKeys(prop.getProperty("validusername"));
		ExplicitWait(validusername).sendKeys(prop.getProperty("validusername"));
	}

	public void user_entered_valid_password() {
		ExplicitWait(validpassword).sendKeys(prop.getProperty("validpassword"));
		// driver.findElement(By.cssSelector("input#password")).sendKeys(prop.getProperty("validpassword"));

	}

	public void click_on_login_button() {
		ExplicitWait(loginbtn).click();
		// driver.findElement(By.cssSelector("input#login-button")).click();
	}

	public void validate_user_logged_successfully() {
		System.out.println("user logged");

	}

	public void user_entered_invalid_username() {
		ExplicitWait(validusername).sendKeys(prop.getProperty("invalidusername"));

	}

	public void user_entered_invalid_password() {
		ExplicitWait(validpassword).sendKeys(prop.getProperty("invlaidpassword"));
	}

	public void validate_error_message() {
		String errormessgae = ExplicitWait(loginerrormsg).getText();
		errormessgae.equals("Username and password do not match any user in this service");

	}

	public void validate_error_message_with_no_username() {
		String errormessgae = ExplicitWait(loginerrormsg).getText();
		errormessgae.equals("Username is required");

	}

	public void validate_error_message_with_no_password() {
		String errormessgae = ExplicitWait(loginerrormsg).getText();
		errormessgae.equals("Password is required");

	}
}