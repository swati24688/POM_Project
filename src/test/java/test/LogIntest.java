package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LogInPage;
import util.BrowserFactory;

public class LogIntest {

	WebDriver driver;
	
//	Test Data
	String userName = "demo@techfios.com";
	String password = "abc123";
	String DashboardValidationText= "Dashboard"; 
	
	
	@Test
	public void validUserShouldBeAbleToLogin() {

		driver = BrowserFactory.init();

		LogInPage LogInPage = PageFactory.initElements(driver, LogInPage.class);
		
		LogInPage.insertUserName(userName);
		LogInPage.insertPassword(password);
		LogInPage.clickSignInButton();
		
	DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
    dashboardPage.validateDashboardPage(DashboardValidationText);
   
    
    BrowserFactory.tearDown();
	
	
	
	}
	
}
