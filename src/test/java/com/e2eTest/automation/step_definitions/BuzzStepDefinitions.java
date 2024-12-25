package com.e2eTest.automation.step_definitions;

import org.junit.jupiter.api.Assertions;

import com.e2eTest.automation.page_objects.BuzzPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuzzStepDefinitions {
	
	BuzzPage buzzPage;
	BuzzStepDefinitions() {
		buzzPage = new BuzzPage();
	}
	
	@When("Je clique sur le bouton buzz")
	public void jeCliqueSurLeBoutonBuzz() {
	    buzzPage.getBtnModuleBuzz();
	}
	@When("Je saisis un buzz {string}")
	public void jeSaisisUnBuzz(String text) {
		buzzPage.getmessagetxt();
	   
	}
	@When("Je  clique sur le bouton post")
	public void jeCliqueSurLeBoutonPost() {
		buzzPage.getbtnPost();
	    
	}
	
	}


