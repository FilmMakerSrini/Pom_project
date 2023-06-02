package orangeHrm.testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import orangeHrm.locators.LoginLocators;
import orangeHrm.locators.PageFactoryLoginLocators;

public class PageFactoryLoginTestScripts {

	WebDriver driver;

	@Test
	public void loginTest() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		PageFactory.initElements(driver, PageFactoryLoginLocators.class);

		PageFactoryLoginLocators.username.sendKeys("Admin");
		PageFactoryLoginLocators.password.sendKeys("admin123");
		PageFactoryLoginLocators.loginBtn.click();

	}

}
