
package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInPage {

	WebDriver driver;

	public LogInPage(WebDriver driver) {

		this.driver = driver;
	} 

	/*
	 * WebElement userNameElement =
	 * driver.findElement(By.xpath("//input[@id='username']")); By userNameField =
	 * By.xpath("//input[@id='username']");
	 */

//	List of Elements
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement userNameElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement passwordElement;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement signinButton;

//Corresponding methods
	public void insertUserName(String userName) {
		userNameElement.sendKeys(userName);
	}

	public void insertPassword(String password) {
		passwordElement.sendKeys(password);
	}

	public void clickSignInButton() {
		signinButton.click();
	}

/*public void loginTest(String userName, String password) {
		userNameElement.sendKeys(userName);
		passwordElement.sendKeys(password);
		signinButton.click();

}*/
}