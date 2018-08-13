package com.stepdefinition;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.Then;

public class StoreResultsStepDef extends AbstractMain {


@Then("^I should see no results found$")
public void i_should_see_no_results_found() throws Throwable {
	storeresultspage.noStoreResultsFound();
}

@Then("^I should see valid results$")
public void i_should_see_valid_results() throws Throwable {
   
}
}
