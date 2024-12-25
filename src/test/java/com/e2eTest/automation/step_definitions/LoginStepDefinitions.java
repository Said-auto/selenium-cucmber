package com.e2eTest.automation.step_definitions;
import org.junit.jupiter.api.Assertions;
import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Setup;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

	ConfigFileReader configFileReader = new ConfigFileReader();
	LoginPage loginPage = new LoginPage();

	@Given("je me connecte sur l application orange")
	public void jeMeConnecteSurLApplicationOrange() throws InterruptedException {
		Setup.getDriver().get(configFileReader.getProperty("home.url"));
		Thread.sleep(5000);

	}

	@When("je saisis un username valide {string}")
	public void jeSaisisUnUsernameValide(String username) throws InterruptedException {
		loginPage.getUsername(username);
		Thread.sleep(3000);

	}

	@And("je saisis un passeword valide {string}")
	public void jeSaisisUnPassewordValide(String passeword) throws InterruptedException {
		loginPage.getPassword(passeword);
		Thread.sleep(3000);
	}

	@When("je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() throws InterruptedException {
		loginPage.getBtnlogin();
		Thread.sleep(5000);

	}

	@Then("je me rederige vers la page home {string}")
	public void jeMeRederigeVersLaPageHome(String text) {

		String homePage = loginPage.getUserHome();
		Assertions.assertEquals(text, homePage);

	}

}
