package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class BuzzPage extends BasePage {

	public BuzzPage() {
		super(Setup.getDriver());
		
	}
	
	@FindBy(how = How.XPATH, using = "//a[@class='oxd-main-menu-item active']")
	private static WebElement moduleBuzz;
	
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder=\"What's on your mind?\"]")
	private static WebElement saisiText;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnPost;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='test 23']")
	private static WebElement messagetxt;

	/* Methods */
	public void getBtnModuleBuzz() {
		moduleBuzz.click();
	}
	public void getsaisiText(String text) {
		saisiText.sendKeys(text);
	}

	public void getbtnPost() {
		btnPost.click();

	}
	public void getmessagetxt() {
		messagetxt.getText();

	}
}
