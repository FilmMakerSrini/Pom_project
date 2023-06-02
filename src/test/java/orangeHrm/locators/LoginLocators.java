package orangeHrm.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginLocators {

	public WebElement username(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@placeholder='Username']"));
	}

	public WebElement password(WebDriver driver) {
		return driver.findElement(By.name("password"));
	}

	public WebElement loginBtn(WebDriver driver) {
		return driver.findElement(By.cssSelector("button[type='submit']"));
	}

}
