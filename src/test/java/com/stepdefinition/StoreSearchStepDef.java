package com.stepdefinition;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StoreSearchStepDef extends AbstractMain{


@When("^I click on  TU store Locator  link$")
public void i_click_on_TU_store_Locator_link() throws Throwable {
	storesearchpage.storeLink();
}

@Then("^I enter \"([^\"]*)\" valid data$")
public void i_enter_valid_data(String validData) throws Throwable {
	storesearchpage.storeValid(validData);
}

@Then("^I enter \"([^\"]*)\" invalid data$")
public void i_enter_invalid_data(String invalidData) throws Throwable {
	storesearchpage.storeInvalid(invalidData);
}

@Then("^I click on find stores button$")
public void i_click_on_find_stores_button() throws Throwable {
   storesearchpage.findStoreButton();
}




}
