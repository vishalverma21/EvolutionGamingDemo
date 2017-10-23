package com.evolutiongaming.stepDefinitions.ui.home;

import org.slf4j.Logger;
import org.junit.Assert;

import com.evolutiongaming.attachhooks.AttachHooks;
import com.evolutiongaming.ui.home.page.EvolutionGamingPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EvolutionGamingStepDef {

	EvolutionGamingPage ePage = new EvolutionGamingPage(AttachHooks.driver);

	Logger logger = org.slf4j.LoggerFactory.getLogger(EvolutionGamingStepDef.class);

	@Given("^Switch to russian language$")
	public void switch_to_russian_language() throws Throwable {
		if (!ePage.switchToRussian()) {
			Assert.fail(); // Method will fail if language is not changed
		}
	}

	@Given("^Select Electrical Engineering$")
	public void select_Electrical_Engineering() throws Throwable {
		if (!ePage.selectEngg()) {
			Assert.fail(); // Method will fail if locator is not found
		}
	}

	@Given("^Go to search and search for (.*)$")
	public void go_to_search_and_search_for_item(String item) throws Throwable {
		if (!ePage.searchItem(item)) {
			Assert.fail(); // Method will fail if wrong item is searched
		}
	}

	@When("^Sort the result by price and select (.*) in transaction type$")
	public void sort_the_result_by_price_and_select_in_transaction_type(String option) throws Throwable {
		if (!ePage.sortAndSelect(option)) {
			Assert.fail(); // Method will fail if transaction type is not located
		}
	}

	@When("^Go to advance search and enter price between (.*) and (.*)$")
	public void go_to_advance_search_and_enter_price_between_and(String min, String max) throws Throwable {
		if (!ePage.advanceSearch(min, max)) {
			Assert.fail(); // Method will fail if advance search locator is not available
		}
	}

	@Then("^Select (.*) adds$")
	public void select_random_adds(int add) throws Throwable {
		if (!ePage.selectCheckbox(add)) {
			Assert.fail(); // Method will fail if check box is not selected
		}
	}

	@Then("^Add adds to bookmark$")
	public void add_adds_to_bookmark() throws Throwable {
		if (!ePage.addToBookmark()) {
			Assert.fail(); // Method will fail if locator is not available
		}
	}

	@Then("^Verify adds are moved to bookmark$")
	public void verify_adds_are_moved_to_bookmark() throws Throwable {
		if (!ePage.varifyBookmark()) {
			Assert.fail(); // Method will fail if verification is failed
		}
	}

}