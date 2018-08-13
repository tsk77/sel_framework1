package com.stepdefinition;

import com.cucumberrunner.AbstractMain;
import com.pages.Homepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDef extends AbstractMain {

@Given("^I am in the homepage$")
public void i_am_in_the_homepage() throws Throwable {
  hp.setHomePage();
}

@When("^I enter Valid data$")
public void i_enter_Valid_data() throws Throwable {
  hp.enterSearchDetails();
}

@When("^I select Search Button$")
public void i_select_Search_Button() throws Throwable {
   hp.searchButton();
}



}
