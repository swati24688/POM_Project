package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.DashboardPage;
import page.LogInPage;
import util.BrowserFactory;

public class AddContactTest {

	WebDriver driver;

//Test Data
	String userName = "demo@techfios.com";
	String password = "abc123";
	String DashboardValidationText = "Dashboard";
	String fullName = "Selenium";
	String company = "Techfios";
	String email = "abc@techfios.com";

	@Test
	public void userShouldBeAbleToAddCustomer() {

		driver = BrowserFactory.init();

		LogInPage LogInPage = PageFactory.initElements(driver, LogInPage.class);

		LogInPage.insertUserName(userName);
		LogInPage.insertPassword(password);
		LogInPage.clickSignInButton();

		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage(DashboardValidationText);
		dashboardPage.clickCustomersButton();
		dashboardPage.clickAddCustomerButton();

		AddContactPage addContactPage = PageFactory.initElements(driver, AddContactPage.class);
		addContactPage.insertFullName(fullName);
		addContactPage.selectCompany(company);
		addContactPage.insertEmail(email);
	}

}
