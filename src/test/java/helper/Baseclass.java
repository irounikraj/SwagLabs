package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public static Properties prop;
	public static Actions action;

	static {
		FileInputStream file;
		try {
			file = new FileInputStream("src/test/java/resources/env.properties");
			prop = new Properties();
			prop.load(file);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void user_launched_site_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

	}

	public void CloseBrowser() {
		driver.close();
	}

	public void mouseHover() {
		driver.navigate().to("https://www.amazon.in/");
		Actions action = new Actions(driver);
		WebElement mousehover = driver.findElement(By.cssSelector("span#nav-link-accountList-nav-line-1"));
		action.moveToElement(mousehover).perform();
		System.out.println("taking screenshot in mousehoverclass");
		takeScreenshot();

	}

	public WebElement ExplicitWait(By by) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));

	}

	public void takeScreenshot() {
		File screenshots = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshots, new File(".//screenshot/screen1.png"));
			System.out.println("taking screenshot");
		} catch (IOException e) {
			System.out.println("not taking screenshot");
			e.printStackTrace();
		}

	}

	public void ClickElement(WebElement ele) {
		ele.click();
	}

	public void HandlingAlertsByApproving(WebElement alert) {
		alert.click();
		// driver.findElement(By.cssSelector("")).click();
		driver.switchTo().alert().accept();

	}

	public void HandlingAlertsByCancel(WebElement alert) {
		alert.click();
		// driver.findElement(By.cssSelector("")).click();
		driver.switchTo().alert().dismiss();

	}
}
