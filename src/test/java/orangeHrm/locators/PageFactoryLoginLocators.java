package orangeHrm.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactoryLoginLocators {

	@FindBy(xpath = "//input[@placeholder='Username']")
	public static WebElement username;

	@FindBy(name = "password")
	public static WebElement password;

	@FindBy(css = "button[type='submit']")
	public static WebElement loginBtn;

}
