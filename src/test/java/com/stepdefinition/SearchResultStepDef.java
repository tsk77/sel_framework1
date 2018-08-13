package com.stepdefinition;

import com.cucumberrunner.AbstractMain;

import com.pages.SearchResultsPage;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchResultStepDef extends AbstractMain{

@Then("^I should see the Valid Results$")
public void i_should_see_the_Valid_Results() throws Throwable {
   
}


@When("^I enter Valid Product id$")
public void i_enter_Valid_Product_id() throws Throwable {
	searchresultspage.searchvalidProductId();
}

@When("^I enter inValid Product id$")
public void i_enter_inValid_Product_id() throws Throwable {
	searchresultspage.searchInvalidProductId();
}

@Then("^it should show product not found$")
public void it_should_show_product_not_found() throws Throwable {
    
}
@When("^I enter Valid \"([^\"]*)\" term$")
public void i_enter_Valid_term(String arg1) throws Throwable {
    searchresultspage.searchSpecificStyle();
}


}
