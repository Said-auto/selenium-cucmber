package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class LogoutPage extends BasePage {

	public LogoutPage() {
		super(Setup.getDriver());
		
	}
	/*Retrieve Element*/
	@FindBy(how = How.XPATH, using ="//p[@class='oxd-userdropdown-name']")
	private static WebElement btnProfil;
	
	/*Retrieve Element*/
	@FindBy(how = How.XPATH, using ="//a[normalize-space()='Logout']")
	private static WebElement btnLogout;
	
	public void getBtnProfil() {
		btnProfil.click();
	}
	public void getBtnLogout() {
		btnLogout.click();
	}
	
}
