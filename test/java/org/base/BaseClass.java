package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
 public static WebDriver driver;
	static Select sc;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TK\\eclipse-workspace\\Adactin_Cucumber\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	public static void loadUrl(String url) {
		driver.get(url);

	}

	public static void type(WebElement element, String name) {
		element.sendKeys(name);

	}

	public static void btn(WebElement element) {
		element.click();

	}
	
	public static void get(WebElement element,String book) {
		element.getText();
	}
}